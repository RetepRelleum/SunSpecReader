package ch.gr.relleum.retep.sunspec;

import android.content.Context;
import android.graphics.Color;
import android.os.AsyncTask;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.Iterator;
import java.util.Objects;

import ch.gr.relleum.retep.sunspec.util.SunSpecAdress;
import ch.gr.relleum.retep.sunspec.util.SunSpecConnectionPool;
import ch.retep.relleum.modbus.Read0X03;
import ch.retep.relleum.modbus.datatype.RegisterSunssf;
import ch.retep.relleum.modbus.datatype.Table;
import ch.retep.relleum.sunspec.TcpModbusHandler;

/**
 * Created by Peter on 01.04.2017.
 */

public class SunSpecList {
    private TableLayout tableLayout;
    private boolean isNaNprinted = false;
    private SunSpecAdress sunSpecAdress;
    private SunSpecActivity sunSpecActivity;


    public void onCreate(SunSpecActivity aSunSpecActivity) {
        sunSpecActivity=aSunSpecActivity;
        tableLayout = (TableLayout) sunSpecActivity.findViewById(R.id.id_TableLayout);
        CheckBox checkBoxIsNaNPritntd = (CheckBox) sunSpecActivity.findViewById(R.id.ID_checkBox_NaN);
        checkBoxIsNaNPritntd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isNaNprinted = !((CheckBox) view).isChecked();
                sunSpecActivity.updateList();
            }
        });

        updateList();
    }

    private void getData(TcpModbusHandler sunspecTcpHandler, TableLayout tableLayout, SunSpecActivity sunSpecActivity, boolean isNaNprinted) {
        if (sunSpecAdress != null) {
            if (sunspecTcpHandler.getInetAddress() == null) {
                ConnectHost connectHost = new ConnectHost();
                connectHost.init(sunspecTcpHandler, sunSpecAdress, tableLayout, sunSpecActivity, isNaNprinted);
                connectHost.execute();
            } else {
                GetSunSpecData getSunSpecData = new GetSunSpecData();
                getSunSpecData.init(sunspecTcpHandler, tableLayout, sunSpecActivity, isNaNprinted);
                getSunSpecData.execute("");
            }

        }
    }

    public void updateList() {

        tableLayout.setBackgroundColor(Color.BLUE);
        sunSpecAdress = SunSpecAdress.getSelected(sunSpecActivity);
        TextView sunSpecHostName = (TextView) sunSpecActivity.findViewById(R.id.Id_sunspecHost);
        sunSpecHostName.requestLayout();
        if (sunSpecAdress!=null) {
            sunSpecHostName.setText(sunSpecAdress.getName());
            TcpModbusHandler sunspecTcpHandler = SunSpecConnectionPool.getTcpModbusHandler(sunSpecAdress);
            if (sunspecTcpHandler != null) {
                getData(sunspecTcpHandler, tableLayout, sunSpecActivity, isNaNprinted);
            }
        }
    }

    public class ConnectHost extends AsyncTask<String, String, String> {
        private TcpModbusHandler sunspecTcpHandler;
        private SunSpecAdress sunSpecAdress;
        private TableLayout tableLayout;
        private Context context;
        private boolean isNaNprinted;



        public void init(TcpModbusHandler aSunspecTcpHandler, SunSpecAdress aSunSpecAdress, TableLayout aTableLayout, SunSpecActivity aSunSpecActivity, boolean aIsNaNprinted) {
            sunspecTcpHandler = aSunspecTcpHandler;
            sunSpecAdress = aSunSpecAdress;
            tableLayout = aTableLayout;
            context = aSunSpecActivity;
            isNaNprinted = aIsNaNprinted;

        }

        @Override
        protected void onPreExecute() {
            sunspecTcpHandler.close();
            sunspecTcpHandler = new TcpModbusHandler();
        }

        @Override
        protected String doInBackground(String... params) {
            boolean b = sunspecTcpHandler.connect(sunSpecAdress.getAdress(), sunSpecAdress.getPort(), sunSpecAdress.getStartingAdress());
            System.out.println("connect " + sunSpecAdress.getIp() + "  " + b);
            return null;
        }


        @Override
        protected void onPostExecute(String result) {
            GetSunSpecData getSunSpecData = new GetSunSpecData();
            getSunSpecData.init(sunspecTcpHandler, tableLayout, context, isNaNprinted);
            getSunSpecData.execute("");

        }
    }

    public class GetSunSpecData extends AsyncTask<String, String, String> {
        private TcpModbusHandler sunspecTcpHandler;
        private Context context;
        private TableLayout tableLayout;
        private boolean isPrintNaN;

        public void init(TcpModbusHandler aSunspecTcpHandler, TableLayout atableLayout, Context aContext,boolean aIsPrintNaN) {
            tableLayout = atableLayout;
            context = aContext;
            sunspecTcpHandler = aSunspecTcpHandler;
            isPrintNaN=aIsPrintNaN;
        }

        @Override
        protected void onPreExecute() {
        }

        @Override
        protected String doInBackground(String... params) {
            if (sunspecTcpHandler.getInetAddress() != null) {
                sunspecTcpHandler.sendAllTable();
                try {
                    while (!sunspecTcpHandler.dataReceived()) {
                        Thread.sleep(10);
                    }
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }


        @Override
        protected void onPostExecute(String result) {
            if (sunspecTcpHandler.getInetAddress() != null) {
                tableLayout.removeAllViews();
                for (Iterator<Table> iter = sunspecTcpHandler.getTables(); iter.hasNext(); ) {
                    Table table = iter.next();
                    tableLayout.addView(getTableRowHeader());
                    for (Iterator<Read0X03> iterator = table.getMessages(); iterator.hasNext(); ) {
                        Read0X03 read0X03 = iterator.next();
                        if ((!read0X03.isNaN() && !(read0X03 instanceof RegisterSunssf))||isPrintNaN) {
                            tableLayout.addView(getTableRow(read0X03));
                        }
                    }
                }
            }
            tableLayout.setBackgroundColor(Color.WHITE);
        }

        @NonNull
        private TableRow getTableRow(Read0X03 read0X03) {
            TableRow tableRow = new TableRow(context);
            TextView textViewName = new TextView(context);
            textViewName.setText(read0X03.getName());
            tableRow.addView(textViewName);
            TextView textViewWert = new TextView(context);
            textViewWert.setText(read0X03.toString() + " " + ((Objects.equals(read0X03.getUnit(), "")) ? "" : (" [" + read0X03.getUnit() + "]")));
            tableRow.addView(textViewWert);
            TextView textViewBeschreibung = new TextView(context);
            textViewBeschreibung.setText(read0X03.getDescription());
            textViewBeschreibung.setSingleLine(false);
            tableRow.addView(textViewBeschreibung);
            return tableRow;
        }

        @NonNull
        private TableRow getTableRowHeader() {
            TableRow tableRowHeader = new TableRow(context);
            tableRowHeader.setBackgroundColor(Color.LTGRAY);
            TextView textViewNameH = new TextView(context);
            textViewNameH.setText(R.string.name);
            textViewNameH.setPadding(0, 4, 0, 3);
            tableRowHeader.addView(textViewNameH);
            TextView textViewWertH = new TextView(context);
            textViewWertH.setText(R.string.wert_einheit);
            tableRowHeader.addView(textViewWertH);

            TextView textViewBeschreibungH = new TextView(context);
            textViewBeschreibungH.setText(R.string.beschreibung);
            tableRowHeader.addView(textViewBeschreibungH);
            return tableRowHeader;
        }

    }


}
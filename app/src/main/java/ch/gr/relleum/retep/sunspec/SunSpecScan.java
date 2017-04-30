/*
 * Copyright © 2017 , Peter Müller. All rights reserved.
 *
 *
 * THE SOFTWARE IS PROVIDED 'AS IS', WITHOUT WARRANTY OF ANY
 * KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT.  IN NO EVENT SHALL THE CONTRIBUTORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR
 * IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS WITH THE
 * SOFTWARE.
 */

package ch.gr.relleum.retep.sunspec;

import android.os.AsyncTask;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.ProgressBar;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Iterator;

import ch.gr.relleum.retep.sunspec.util.InputFilterMinMax;
import ch.gr.relleum.retep.sunspec.util.IpListAdapter;
import ch.gr.relleum.retep.sunspec.util.SunSpecListAdapter;
import ch.retep.relleum.network.LocalNet;
import ch.retep.relleum.sunspec.SunSpecAdressItem;

/**
 * Created by Peter on 28.01.2017.
 */

public class SunSpecScan {
    private EditText[] editTextsIP = new EditText[4];
    private EditText numberPickerPort;
    private EditText numberPickerUnitId;
    private EditText numberPickerStartingAdress;
    private ProgressBar progressBar;

    private static Iterator<InetAddress> inetAddressIterator;
    private SunSpecActivity sunSpecActivity;
    private InetAddress inetAddress;
    private IpListAdapter ipListAdapter;


    public void onCreate(SunSpecActivity aSunSpecActivity) {
        sunSpecActivity=aSunSpecActivity ;
        InetAddress inetAddress = LocalNet.getLocalIpAddress();
        SunSpecListAdapter sunSpecListAdapter = new SunSpecListAdapter(sunSpecActivity);
        ipListAdapter = new IpListAdapter(sunSpecActivity, sunSpecListAdapter);
        ListView listView_ip = (ListView) aSunSpecActivity.findViewById(R.id.id_ip_list);
        listView_ip.setAdapter(ipListAdapter);
        ListView listView_Host = (ListView) aSunSpecActivity.findViewById(R.id.id_listView);
        listView_Host.setAdapter(sunSpecListAdapter);
        editTextsIP[0] = (EditText) aSunSpecActivity.findViewById(R.id.Id_numberPicker1);
        editTextsIP[1] = (EditText) aSunSpecActivity.findViewById(R.id.Id_numberPicker2);
        editTextsIP[2] = (EditText) aSunSpecActivity.findViewById(R.id.Id_numberPicker3);
        editTextsIP[3] = (EditText) aSunSpecActivity.findViewById(R.id.Id_numberPicker4);

        for (int i = 0; i < editTextsIP.length; i++) {
            editTextsIP[i].setFilters(new InputFilter[]{new InputFilterMinMax(0, 255)});
            editTextsIP[i].setText(String.valueOf((inetAddress != null ? inetAddress.getAddress() : new byte[0])[i] & 0Xff));
        }

        numberPickerPort = (EditText) aSunSpecActivity.findViewById(R.id.numberPicker_Port);
        numberPickerPort.setFilters(new InputFilter[]{new InputFilterMinMax(0, 65535)});
        numberPickerPort.setText(R.string.t502);

        numberPickerUnitId = (EditText) aSunSpecActivity.findViewById(R.id.Id_numberPicker_Unit_Id);
        numberPickerUnitId.setFilters(new InputFilter[]{new InputFilterMinMax(0, 255)});
        numberPickerUnitId.setText(R.string.t126);

        numberPickerStartingAdress = (EditText) aSunSpecActivity.findViewById(R.id.Id_numberPicker_Starting_Adresse);
        numberPickerStartingAdress.setFilters(new InputFilter[]{new InputFilterMinMax(0, 90000)});

        numberPickerStartingAdress.setText(R.string.t40000);
        progressBar = (ProgressBar) aSunSpecActivity.findViewById(R.id.id_progressBarScan);
        progressBar.setVisibility(ProgressBar.INVISIBLE);
        ImageButton buttonScan = (ImageButton) aSunSpecActivity.findViewById(R.id.id_Button_ScanNetwork);
        buttonScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SunSpecSan sunSpecSan = new SunSpecSan();
                sunSpecSan.execute();
            }
        });
        Button buttonErneuern = (Button) sunSpecActivity.findViewById(R.id.ID_button_erneuern1);
        buttonErneuern.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sunSpecActivity.updateList();
            }
        });

    }

    class SunSpecSan extends AsyncTask<String, String, String> {
        byte[] bytes;
        int port;
        boolean scan = true;

        @Override
        protected void onPreExecute() {
            progressBar.setVisibility(ProgressBar.VISIBLE);
            bytes = new byte[]{(byte) (Integer.parseInt(editTextsIP[0].getText().toString()) & 0XFF), (byte) (Integer.parseInt(editTextsIP[1].getText().toString()) & 0XFF), (byte) (Integer.parseInt(editTextsIP[2].getText().toString()) & 0XFF), (byte) (Integer.parseInt(editTextsIP[3].getText().toString()) & 0XFF)};
            port = Integer.parseInt(numberPickerPort.getText().toString());

        }

        @Override
        protected String doInBackground(String... params) {
            if (inetAddressIterator == null || !inetAddressIterator.hasNext()) {
                try {
                    inetAddressIterator = LocalNet.scanNetoworkAtPort(InetAddress.getByAddress(bytes), port);
                } catch (UnknownHostException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }

        @Override
        protected void onPostExecute(String result) {
            ipListAdapter.clear();
            progressBar.setVisibility(ProgressBar.INVISIBLE);
            if (!(inetAddressIterator == null || !inetAddressIterator.hasNext())) {
                while (inetAddressIterator.hasNext()) {
                    InetAddress inetAddress = inetAddressIterator.next();
                    SunSpecAdressItem item = new SunSpecAdressItem(inetAddress.getHostName(),inetAddress.getHostAddress(),Integer.parseInt(numberPickerPort.getText().toString()),Integer.parseInt(numberPickerUnitId.getText().toString()),Integer.parseInt(numberPickerStartingAdress.getText().toString()));
                    ipListAdapter.add(item);
                }
            }
        }
    }


}

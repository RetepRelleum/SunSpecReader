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

package ch.gr.relleum.retep.sunspec.util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.TextView;

import ch.gr.relleum.retep.sunspec.R;
import ch.gr.relleum.retep.sunspec.SunSpecActivity;

/**
 * Created by Peter on 29.01.2017.
 */

public class SunSpecListAdapter extends BaseAdapter implements ListAdapter {

    private SunSpecActivity sunSpecActivity;


    public SunSpecListAdapter(SunSpecActivity sunSpecActivity ) {
        this.sunSpecActivity = sunSpecActivity;
    }

    @Override
    public int getCount() {
        return SunSpecAdress.getCount(sunSpecActivity);
    }

    @Override
    public SunSpecAdress getItem(int pos) {
        return SunSpecAdress.get(pos, sunSpecActivity);
    }

    @Override
    public long getItemId(int pos) {
        return SunSpecAdress.get(pos, sunSpecActivity).getId();
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        final SunSpecAdress sunSpecAdress = SunSpecAdress.get(position, sunSpecActivity);

        View view = convertView;
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) sunSpecActivity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.list_row, null);
        }

        EditText listItemName = (EditText) view.findViewById(R.id.id_ListAdapterName);
        listItemName.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                EditText editText = (EditText) v;
                sunSpecAdress.setName(editText.getText().toString());

            }
        });

        listItemName.setText(sunSpecAdress.getName());
        TextView listItemHostName = (TextView) view.findViewById(R.id.id_ListAdapterHostName);
        listItemHostName.setText(sunSpecAdress.getHostName());
        TextView listItemIP = (TextView) view.findViewById(R.id.id_ListAdapterIP);
        listItemIP.setText(sunSpecAdress.getIp());
        TextView listItemPort = (TextView) view.findViewById(R.id.id_ListAdapterPort);
        listItemPort.setText(String.valueOf(sunSpecAdress.getPort()));
        TextView listItemUnitID = (TextView) view.findViewById(R.id.id_ListAdapterUnitId);
        listItemUnitID.setText(String.valueOf(sunSpecAdress.getUnitId()));
        TextView listItemStartingAdress = (TextView) view.findViewById(R.id.id_ListAdapterStartingAdress);
        listItemStartingAdress.setText(String.valueOf(sunSpecAdress.getStartingAdress()));
        final CheckBox checkBox = (CheckBox) view.findViewById(R.id.id_ListAdapterIsSelected);
        checkBox.setChecked(sunSpecAdress.isSelected());
        checkBox.setText(String.valueOf(sunSpecAdress.getId()));
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SunSpecAdress.get(position, sunSpecActivity).setSelectet(sunSpecActivity);
                notifyDataSetChanged();
               sunSpecActivity.updateList();
            }
        });

        //Handle buttons and add onClickListeners
        ImageButton deleteBtn = (ImageButton) view.findViewById(R.id.id_ListAdapterdelete_btn);
        deleteBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {//do something
                SunSpecAdress.get(position, sunSpecActivity).delete();
                notifyDataSetChanged();
            }
        });
        return view;
    }


}


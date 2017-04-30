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
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import ch.gr.relleum.retep.sunspec.R;
import ch.retep.relleum.sunspec.SunSpecAdressItem;

/**
 * Created by Peter on 04.02.2017.
 */

public class IpListAdapter extends BaseAdapter implements ListAdapter {
    private ArrayList<SunSpecAdressItem> list = new ArrayList<>();
    private Context context;
    private SunSpecListAdapter sunSpecListAdapter;


    public IpListAdapter(Context context, SunSpecListAdapter aSunSpecListAdapter) {
        this.context = context;
        sunSpecListAdapter=aSunSpecListAdapter;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public SunSpecAdressItem getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_row_plus, parent, false);
        }
        TextView tvName = (TextView) convertView.findViewById(R.id.Id_ip_List_textView);
        tvName.setText(getItem(position).getIp());
        Button button = (Button) convertView.findViewById(R.id.id_ip_List_button);
        button.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                SunSpecAdressItem sunSpecAdressItem = list.get(position);
                SunSpecAdress sunSpecAdress = new SunSpecAdress(sunSpecAdressItem, context);
                list.remove(position);
                notifyDataSetChanged();
                sunSpecListAdapter.notifyDataSetChanged();
            }
        });
        return convertView;
    }

    public void clear() {
        list.clear();
    }

    public void add(SunSpecAdressItem sunSpecAdressItem) {
        list.add(sunSpecAdressItem);
        notifyDataSetChanged();
    }
}



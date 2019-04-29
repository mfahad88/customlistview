package league.fantasy.psl.com.customlistview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.TextView;
import java.util.ArrayList;
/**
 * Created by coderzpassion on 13/03/16.
 */
public class MyCustomAdapter extends BaseAdapter {
    private Context mContext;
    ArrayList<MyItem> mylist=new ArrayList<>();
    public MyCustomAdapter(ArrayList<MyItem> itemArray,Context mContext) {
        super();
        this.mContext = mContext;
      mylist=itemArray;
    }
    @Override
    public int getCount() {
        return mylist.size();
    }
    @Override
    public String getItem(int position) {
        return mylist.get(position).toString();
    }
    @Override
    public long getItemId(int position) {
        return position;
    }
    public void onItemSelected(int position) {
    }
    /*public class ViewHolder {
        public TextView nametext;
        public CheckBox tick;
    }*/
    @Override
    public View getView(final int position, View convertView,
                        ViewGroup parent) {
        // TODO Auto-generated method stub
        //ViewHolder view = null;
        LayoutInflater inflator = ((Activity) mContext).getLayoutInflater();
        convertView = inflator.inflate( R.layout.myadapter, null);
        TextView nametext = (TextView) convertView.findViewById(R.id.adaptertextview);
        CheckBox tick=(CheckBox)convertView.findViewById(R.id.adaptercheckbox);
        tick.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
               // int getPosition = (Integer) buttonView.getTag(); // Here
                // we get  the position that we have set for the checkbox using setTag.
                mylist.get(position).setChecked(buttonView.isChecked()); // Set the value of checkbox to maintain its state.

            }
        });

        nametext.setText("" + mylist.get(position).getTitle());
        tick.setChecked(mylist.get(position).isChecked());
        return convertView;
    }
}
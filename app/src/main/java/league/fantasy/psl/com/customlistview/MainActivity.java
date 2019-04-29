package league.fantasy.psl.com.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView mainactivity;
    // creating arraylist of MyItem type to set to adapter
    ArrayList<MyItem> myitems=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainactivity=(ListView)findViewById(R.id.mainactivitylistview);
        //Adding data i.e images and title to be set to adapter to populate listview
        //here i am passing  string to be set as title and boolean as a parameter to MyItem Constructor as our
        //ArrayList is type of MyItem
        myitems.add(new MyItem("First item",false));
        myitems.add(new MyItem("second item",false));
        myitems.add(new MyItem("third item",false));
        myitems.add(new MyItem("fourth item",false));
        myitems.add(new MyItem("fifth item",false));
        myitems.add(new MyItem("sixth item",false));
        myitems.add(new MyItem("seven item",false));
        myitems.add(new MyItem("First item",false));
        myitems.add(new MyItem("second item",false));
        myitems.add(new MyItem("third item",false));
        myitems.add(new MyItem("fourth item",false));
        myitems.add(new MyItem("fifth item",false));
        myitems.add(new MyItem("sixth item",false));
        myitems.add(new MyItem("seven item",false));
        myitems.add(new MyItem("First item",false));
        myitems.add(new MyItem("second item",false));
        myitems.add(new MyItem("third item",false));
        myitems.add(new MyItem("fourth item",false));
        myitems.add(new MyItem("fifth item",false));
        myitems.add(new MyItem("sixth item",false));
        myitems.add(new MyItem("seven item",false));
        //Creating Adapter object for setting to list
        MyCustomAdapter adapter=new MyCustomAdapter(myitems,MainActivity.this);
        mainactivity.setAdapter(adapter);
    }


}

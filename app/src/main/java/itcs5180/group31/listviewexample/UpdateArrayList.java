package itcs5180.group31.listviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class UpdateArrayList extends AppCompatActivity {

    ArrayList<Color> data = new ArrayList<>();
    ArrayAdapter<Color> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_array_list);
        setTitle("Update List View Example");

        data.add(new Color("Pink"));
        data.add(new Color("Orange"));
        data.add(new Color("Red"));
        data.add(new Color("Purple"));
        data.add(new Color("Rose"));
        data.add(new Color("Rosario"));

        ListView listView = findViewById(R.id.listView);

        adapter = new ArrayAdapter<UpdateArrayList.Color>(this, android.R.layout.simple_list_item_1,
                android.R.id.text1, data);

        listView.setAdapter(adapter);

        // to add
        findViewById(R.id.bAdd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = ((EditText) findViewById(R.id.etNewColor)).getText().toString();
                adapter.add(new Color(text));
                ((EditText) findViewById(R.id.etNewColor)).setText("");
                adapter.notifyDataSetChanged();
            }
        });


        // to remove (long click)
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Color color = adapter.getItem(position);
                adapter.remove(color);
                adapter.notifyDataSetChanged();
                return true; //does not affect the long-click, but should this also consume the release click?
                //with false, the item that slides into place is clicked when you pull your finger away
                //with true, nothing happens when you pull your finger away.
            }
        });
    }

    //Reference class, perhaps a custom class
    static class Color{
        String name;
        int hex;

        public Color(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}

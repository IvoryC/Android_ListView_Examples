package itcs5180.group31.listviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SimpleStringsListView extends AppCompatActivity {

    String[] colors = {"Red", "Blue", "White", "Green", "Gray", "Orange", "Oregano"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_strings_list_view);
        setTitle("Simple Strings Array Example");

        ListView listView = findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                android.R.id.text1, colors);

        listView.setAdapter(adapter);

    }
}

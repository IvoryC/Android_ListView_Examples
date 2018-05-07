package itcs5180.group31.listviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SimpleObjectArrayListView extends AppCompatActivity {

    //String[] colors = {"Red", "Blue", "White", "Green", "Gray", "Orange", "Oregano"};
    Color[] colorsObjects = {new Color("Blue"), new Color("Green"),new Color("Red"),
            new Color("Yellow"),new Color("Hello")};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_strings_list_view);
        setTitle("Object Array Example");

        ListView listView = findViewById(R.id.listView);


        // color -> colorObjects
        // String -> Color
        ArrayAdapter<Color> adapter = new ArrayAdapter<Color>(this, android.R.layout.simple_list_item_1,
                android.R.id.text1, colorsObjects);

        listView.setAdapter(adapter);

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

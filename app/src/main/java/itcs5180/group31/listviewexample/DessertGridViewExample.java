package itcs5180.group31.listviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class DessertGridViewExample extends AppCompatActivity {

    ArrayList<Dessert> desserts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert_grid_view_example);
        setTitle("Grid View Dessert Example");

        desserts.add(new Dessert("Ice Cream Sunday", 2000));
        desserts.get(desserts.size()-1).imgUrl = "http://www.clker.com/cliparts/5/c/0/b/1277924164784316276sundae.png";
        desserts.add(new Dessert("Cherries", 400));
        desserts.get(desserts.size()-1).imgUrl = "https://www.bing.com/th?id=OIP.nl8Fs6NxEVnyVjPh8Tbh7wHaFj&pid=Api";
        desserts.add(new Dessert("Hot Chocolate", 450));
        desserts.get(desserts.size()-1).imgUrl = "https://www.bing.com/th?id=OIP.QnvzdWK-Xb_nGg6n-sKIKAHaLH&pid=Api";
        desserts.add(new Dessert("Banana Split", 1000));
        desserts.get(desserts.size()-1).imgUrl = "https://img.purch.com/h/1000/aHR0cDovL3d3dy5zcGFjZS5jb20vaW1hZ2VzL2kvMDAwLzA3Ni8xODMvb3JpZ2luYWwvZWxvbi1tdXNrLWZhbGNvbi05LWJsb2NrLTUuanBn";
        desserts.add(new Dessert("Strawberries", 300));
        desserts.add(new Dessert("Pumpkin Pie", 450));
        desserts.get(desserts.size()-1).imgUrl = "http://www.chowstatic.com/assets/recipe_photos/30175_easy_pumpkin_pie.jpg";

        GridView gridView = findViewById(R.id.gridView);
        DessertAdapter adapter = new DessertAdapter(this, R.layout.dessert_item_grid_layout, desserts);

        gridView.setAdapter(adapter);
    }
}

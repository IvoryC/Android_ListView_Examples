package itcs5180.group31.listviewexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("ListView Examples");

        findViewById(R.id.bSimpleStrings).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SimpleStringsListView.class);
                startActivity(i);
            }
        });

        findViewById(R.id.bSimpleObjectArray).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SimpleObjectArrayListView.class);
                startActivity(i);
            }
        });

        findViewById(R.id.bUpdateArrayList).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, UpdateArrayList.class);
                startActivity(i);
            }
        });

        findViewById(R.id.bEmailExapmle).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, EmailExample.class);
                startActivity(i);
            }
        });

        findViewById(R.id.bRecyclerView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, CartoonCharRecylcerViewExample.class);
                startActivity(i);
            }
        });

        findViewById(R.id.bGridView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, DessertGridViewExample.class);
                startActivity(i);
            }
        });
    }
}

package itcs5180.group31.listviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class CartoonCharRecylcerViewExample extends AppCompatActivity {

    // developers page: https://developer.android.com/guide/topics/ui/layout/recyclerview

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    ArrayList<CartoonChar> myDataset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recylcer_view_cartoon_example);
        setTitle("Recycler View Example");

        myDataset = new ArrayList<>();
        myDataset.add(new CartoonChar("Aladin", "Aladin", "human", "male"));
        myDataset.add(new CartoonChar("Jasmine", "Aladin", "human", "female"));
        myDataset.add(new CartoonChar("Abu", "Aladin", "monkey", "male"));
        myDataset.add(new CartoonChar("Eago", "Aladin", "parrot", "male"));
        myDataset.add(new CartoonChar("Sultan", "Aladin", "human", "male"));

        Log.d("recycler", "The arrayList myDataset has size:" + myDataset.size());

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        Log.d("recycler", "Creating adapter...");
        mAdapter = new CartoonAdapter(myDataset);
        Log.d("recycler", "Setting adapter...");
        mRecyclerView.setAdapter(mAdapter);
    }
}

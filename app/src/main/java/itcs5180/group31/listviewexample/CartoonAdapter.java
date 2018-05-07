package itcs5180.group31.listviewexample;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ivory on 5/7/18.
 */

public class CartoonAdapter extends RecyclerView.Adapter {

    private ArrayList<CartoonChar> mDataset;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView tvName;
        public TextView tvShow;
        public TextView tvSpecies;
        public ViewHolder(TextView v) {
            super(v);
            this.tvName = v;
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public CartoonAdapter(ArrayList<CartoonChar> myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public CartoonAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        View singleLayout = LayoutInflater.from(parent.getContext()).inflate(R.layout.cartoon_char_single_recycler_view, parent, false);

        ViewHolder vh = new ViewHolder((TextView) singleLayout.findViewById(R.id.tvName));

        vh.tvName = singleLayout.findViewById(R.id.tvName);
        vh.tvShow = singleLayout.findViewById(R.id.tvShow);
        vh.tvSpecies = singleLayout.findViewById(R.id.tvSpecies);

        return vh;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Log.d("recycler", "Entered onBindViewHolder...");
        updateHolder((CartoonAdapter.ViewHolder) holder, position);
        Log.d("recycler", "Finished onBindViewHolder...");
    }

    // Replace the contents of a view (invoked by the layout manager)
    public void updateHolder(ViewHolder holder, int position) {
        Log.d("recycler", "Entered updateHolder...");
        // - get element from your dataset at this position
        CartoonChar toon = mDataset.get(position);
        // - replace the contents of the view with that element
        holder.tvName.setText(toon.name);
        holder.tvShow.setText(toon.show);
        holder.tvSpecies.setText(toon.species);
        Log.d("recycler", "Finished part2...");
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}

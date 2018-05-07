package itcs5180.group31.listviewexample;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by ivory on 5/7/18.
 */

public class DessertAdapter extends ArrayAdapter<Dessert> {
    public DessertAdapter(@NonNull Context context, int resource, @NonNull List<Dessert> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Dessert dessert = getItem(position);

        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.dessert_item_grid_layout, parent, false);
        }

        TextView tvName = convertView.findViewById(R.id.tvName);
        TextView tvCalories = convertView.findViewById(R.id.tvCalories);
        ImageView imageView = convertView.findViewById(R.id.ivDessertImage);

        tvName.setText(dessert.name);
        tvCalories.setText(String.valueOf(dessert.calories));
        if (dessert.imgUrl != null){
            Picasso.with(getContext()).load(dessert.imgUrl).into(imageView);
        }

        return convertView;
    }
}

package itcs5180.group31.listviewexample;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by ivory on 5/6/18.
 */

public class EmailAdapter extends ArrayAdapter<Email> {
    public EmailAdapter(@NonNull Context context, int resource, @NonNull List<Email> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Email email = getItem(position);

        // if using a holder
        ViewHolder viewHolder;

        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.email_item_layout, parent, false);

            //if using a holder
            viewHolder = new ViewHolder();
            viewHolder.tvSubject = convertView.findViewById(R.id.tvSubject);
            viewHolder.tvSender = convertView.findViewById(R.id.tvSender);
            viewHolder.tvTimeSent = convertView.findViewById(R.id.tvTimeSent);
            viewHolder.tvEmailBody = convertView.findViewById(R.id.tvEmailBody);
            convertView.setTag(viewHolder);
        } else {
            // if using a holder
            viewHolder = (ViewHolder) convertView.getTag();
        }

        // if NOT using a holder
//        TextView tvSubject = convertView.findViewById(R.id.tvSubject);
//        TextView tvSender = convertView.findViewById(R.id.tvSender);
//        TextView tvTimeSent = convertView.findViewById(R.id.tvTimeSent);
//        TextView tvEmailBody = convertView.findViewById(R.id.tvEmailBody);
//
//        tvSubject.setText(email.subject);
//        tvSender.setText(email.fromPerson);
//        tvTimeSent.setText(email.timeSent.toString());
//        tvEmailBody.setText(email.body);

        // if using a holder
        viewHolder.tvSubject.setText(email.subject);
        viewHolder.tvSender.setText(email.fromPerson);
        viewHolder.tvTimeSent.setText(email.timeSent.toString());
        viewHolder.tvEmailBody.setText(email.body);

        // always
        return convertView;
    }

    // if using a holder, you must define it
    // The holder allows us to reduce the times that we have to findViewById,
    // making the whole system much more efficient.
    private static class ViewHolder{
        TextView tvSubject;
        TextView tvSender;
        TextView tvTimeSent;
        TextView tvEmailBody;
    }
}

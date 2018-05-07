package itcs5180.group31.listviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Date;

public class EmailExample extends AppCompatActivity {
    ArrayList<Email> emails = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_example);
        setTitle("Email Example");

        emails.add(new Email("this is an example", "Joe", "Bob", "Hey, just wanted you to have an example", new Date()));
        emails.add(new Email("Andromeda", "Dylan Hunt", "all", "We have a mission to restore peace to the galaxy.", new Date()));
        emails.add(new Email("bluffing", "Jim", "Spoke", "Not chess, Mr. Spock. Poker!", new Date()));
        emails.add(new Email("riveting", "Picard", "TenForward.listServe", "Come chear up my lads 'tis to glory we steer!", new Date()));
        emails.add(new Email("Anomaly in the delta quadrant", "Com. Data", "Captain Picard", "Captain, we are picking up unusual readings in the delta quadrant.", new Date()));
        emails.add(new Email("msg1", "Jim", "Spoke", "Not chess, Mr. Spock. Poker!", new Date()));
        emails.add(new Email("msg2", "Jim", "Spoke", "Not chess, Mr. Spock. Poker!", new Date()));
        emails.add(new Email("msg3", "Jim", "Spoke", "Not chess, Mr. Spock. Poker!", new Date()));
        emails.add(new Email("msg4", "Jim", "Spoke", "Not chess, Mr. Spock. Poker!", new Date()));
        emails.add(new Email("msg5", "Jim", "Spoke", "Not chess, Mr. Spock. Poker!", new Date()));

        ListView listView = findViewById(R.id.listView);
        EmailAdapter adapter = new EmailAdapter(this, R.layout.email_item_layout, emails);



        listView.setAdapter(adapter);

    }
}

package itcs5180.group31.listviewexample;

import android.provider.ContactsContract;

import java.util.Date;

/**
 * Created by ivory on 5/6/18.
 */

public class Email {
    String subject, fromPerson, toPerson, body;
    Date timeSent;

    public Email(String subject, String fromPerson, String toPerson, String body, Date timeSent) {
        this.subject = subject;
        this.fromPerson = fromPerson;
        this.toPerson = toPerson;
        this.body = body;
        this.timeSent = timeSent;
    }

    @Override
    public String toString() {
        return "Email{" +
                "subject='" + subject + '\'' +
                ", fromPerson='" + fromPerson + '\'' +
                ", toPerson='" + toPerson + '\'' +
                ", body='" + body + '\'' +
                ", timeSent=" + timeSent +
                '}';
    }
}

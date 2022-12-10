package com.job.JobAssist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import org.w3c.dom.Text;

public class AboutUs extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);

        TextView mtwitter = findViewById(R.id.mohit_twitter);
        mtwitter.setMovementMethod(LinkMovementMethod.getInstance());

        TextView ptwitter = findViewById(R.id.pranay_twitter);
        ptwitter.setMovementMethod(LinkMovementMethod.getInstance());

        TextView atwitter = findViewById(R.id.raut_twitter);
        atwitter.setMovementMethod(LinkMovementMethod.getInstance());

        TextView htwitter = findViewById(R.id.hrishi_twitter);
        htwitter.setMovementMethod(LinkMovementMethod.getInstance());
    }



}

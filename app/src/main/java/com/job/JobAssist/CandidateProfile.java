package com.job.JobAssist;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CandidateProfile extends AppCompatActivity {
    TextView tv_name,tv_sex, tv_city,tv_address,
            tv_pincode,tv_10marks,tv_10year,tv_12marks,
            tv_12year,tv_ugmarks,tv_ugyear,tv_ugcourse,
            tv_pgmarks,tv_pgyear,tv_pgcourse,tv_skills,
            tv_achievement,tv_certification,tv_workexp
            ,tv_dob,tv_email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_candidate_profile);
        tv_name=(TextView)findViewById(R.id.tv_name);
        tv_sex=(TextView)findViewById(R.id.tv_sex);
        tv_email=(TextView)findViewById(R.id.tv_email);
        tv_city=(TextView)findViewById(R.id.tv_city);
        tv_address=(TextView)findViewById(R.id.tv_address);
        tv_pincode=(TextView)findViewById(R.id.tv_pincode);
        tv_10marks=(TextView)findViewById(R.id.tv_10marks);
        tv_10year=(TextView)findViewById(R.id.tv_10year);
        tv_12marks=(TextView)findViewById(R.id.tv_12marks);
        tv_12year=(TextView)findViewById(R.id.tv_12year);
        tv_ugcourse=(TextView)findViewById(R.id.tv_ugcourse);
        tv_ugmarks=(TextView)findViewById(R.id.tv_ugmarks);
        tv_ugyear=(TextView)findViewById(R.id.tv_ugyear);
        tv_pgcourse=(TextView)findViewById(R.id.tv_pgcourse);
        tv_pgmarks=(TextView)findViewById(R.id.tv_pgmarks);
        tv_pgyear=(TextView)findViewById(R.id.tv_pgyear);
        tv_skills=(TextView)findViewById(R.id.tv_skills);
        tv_achievement=(TextView)findViewById(R.id.tv_achievement);
        tv_certification=(TextView)findViewById(R.id.tv_certification);
        tv_workexp=(TextView)findViewById(R.id.tv_workexp);
        tv_dob=(TextView)findViewById(R.id.tv_dob);

        String name=getIntent().getExtras().getString("name");
        String sex=getIntent().getExtras().getString("sex");
        String city=getIntent().getExtras().getString("city");
        String address=getIntent().getExtras().getString("address");
        String pincode=getIntent().getExtras().getString("pincode");
        String xmarks=getIntent().getExtras().getString("xmarks");
        String xyear=getIntent().getExtras().getString("xyear");
        String xiimarks=getIntent().getExtras().getString("xiimarks");
        String xiiyear=getIntent().getExtras().getString("xiiyear");
        String ugmarks=getIntent().getExtras().getString("ugmarks");
        String ugyear=getIntent().getExtras().getString("ugyear");
        String ugcourse=getIntent().getExtras().getString("ugcourse");
        String skills=getIntent().getExtras().getString("skills");
        String achievements=getIntent().getExtras().getString("achievements");
        String certification=getIntent().getExtras().getString("certifications");
        String workexp=getIntent().getExtras().getString("workexp");
        String dob=getIntent().getExtras().getString("dob");
        String email=getIntent().getExtras().getString("email");



        tv_name.setText(name);
        tv_sex.setText(sex);
        tv_city.setText(city);
        tv_address.setText(address);
        tv_pincode.setText(pincode);
        tv_10marks.setText(xmarks);
        tv_10year.setText(xyear);
        tv_12marks.setText(xiimarks);
        tv_12year.setText(xiiyear);
        tv_ugcourse.setText(ugcourse);
        tv_ugmarks.setText(ugmarks);
        tv_ugyear.setText(ugyear);
        tv_skills.setText(skills);
        tv_achievement.setText(achievements);
        tv_certification.setText(certification);
        tv_workexp.setText(workexp);
        tv_dob.setText(dob);
        tv_email.setText(email);

    }
}

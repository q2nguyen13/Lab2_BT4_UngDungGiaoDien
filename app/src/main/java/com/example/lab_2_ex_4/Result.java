package com.example.lab_2_ex_4;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    TextView name_of_result;
    TextView email_of_result;
    TextView project_of_result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        name_of_result = (TextView) findViewById(R.id.name);
        email_of_result = (TextView) findViewById(R.id.email) ;
        project_of_result = (TextView) findViewById(R.id.project);
        Intent mIntent = getIntent();
        String name = mIntent.getStringExtra("name");
        String email = mIntent.getStringExtra("email");
        String project = mIntent.getStringExtra("project");

        name_of_result.setText(name);
        email_of_result.setText(email);
        project_of_result.setText(project);
    }
}
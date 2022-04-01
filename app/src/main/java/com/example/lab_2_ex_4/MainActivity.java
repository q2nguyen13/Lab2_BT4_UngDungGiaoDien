package com.example.lab_2_ex_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    public EditText name;
    public EditText email;
    public EditText project;
    public Button click_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.editText_Name);
        email = (EditText) findViewById(R.id.editText_email);
        project = (EditText) findViewById(R.id.editText_project);
        click_view = (Button) findViewById(R.id.button_view);

        click_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Result.class);
                String name_text = name.getText().toString();
                i.putExtra("name",name_text);
                String email_text = email.getText().toString();
                i.putExtra("email",email_text);
                String project_text = project.getText().toString();
                i.putExtra("project",project_text);
                startActivity(i);

            }
        });

    }
}
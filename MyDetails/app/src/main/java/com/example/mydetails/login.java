package com.example.mydetails;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;



public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button personaldetails;
        personaldetails = findViewById(R.id.personaldetail);
        personaldetails.setOnClickListener(view -> {
            Intent intent1 = new Intent(login.this,personal_details.class);
            startActivity(intent1);
        });

        Button educationaldetails;
        educationaldetails = findViewById(R.id.educationaldetail);
        educationaldetails.setOnClickListener(view -> {
            Intent i = new Intent(login.this,educationaldetails.class);
            startActivity(i);
        });

        Button companydetails;
        companydetails = findViewById(R.id.companydetail);
        companydetails.setOnClickListener(view -> {
            Intent intent = new Intent(login.this,company_details.class);
            startActivity(intent);
        });

        Button resume;
        resume = findViewById(R.id.resume);
        resume.setOnClickListener(view -> {
            Intent intent2 = new Intent(login.this,resume.class);
            startActivity(intent2);
        });


    }
}
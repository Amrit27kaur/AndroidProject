package com.example.androidproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ProfileLayout extends AppCompatActivity {

    private TextView na;
    private TextView des;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_layout);

         na = (TextView)findViewById(R.id.txtName);

        des = (TextView)findViewById(R.id.txtDesc);

        String name1 = getIntent().getStringExtra("name");

        String descri = getIntent().getStringExtra("desc");

        na.setText(name1);
        des.setText(descri);
    }
}

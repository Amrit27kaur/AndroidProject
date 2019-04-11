package com.example.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnClick(View btnView) {

        TextView result = (TextView) findViewById(R.id.lbl3);
        EditText num1 = (EditText) findViewById(R.id.txtFirstNumber);
        EditText num2 = (EditText) findViewById(R.id.txtSecondNumber);

        int sum = Integer.parseInt(num1.getText().toString()) + Integer.parseInt(num2.getText().toString());
        result.setText("sum is " +Integer.toString(sum));

    }


    public void btnClick1(View btnView) {

        TextView result = (TextView) findViewById(R.id.lbl3);
        EditText num1 = (EditText) findViewById(R.id.txtFirstNumber);
        EditText num2 = (EditText) findViewById(R.id.txtSecondNumber);

        int multi = Integer.parseInt(num1.getText().toString()) * Integer.parseInt(num2.getText().toString());
        result.setText("multiplicTION IS " +Integer.toString(multi));

    }

    public void btnClick2(View btnView) {

        TextView result = (TextView) findViewById(R.id.lbl3);
        EditText num1 = (EditText) findViewById(R.id.txtFirstNumber);
        EditText num2 = (EditText) findViewById(R.id.txtSecondNumber);

        int div = Integer.parseInt(num1.getText().toString()) / Integer.parseInt(num2.getText().toString());
        result.setText("DIVision is " + Integer.toString(div));

    }
}
package com.example.androidproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

private  EditText et1;
private  EditText et2;

    ArrayList<String> names = new ArrayList<String>();
    ArrayList<String> description = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.name);

        et2 = (EditText)findViewById(R.id.des);

      //  String names[] = {"John ", "Jane" , "Sam"};
     //  String description[] = {"some desc ab rtjohn ", "Jfdgdfgdfgane" , "Sa6456456m"};


       onCall();
    }

public void addUser (View v)
{


    names.add(et1.getText().toString());

    description.add(et2.getText().toString());

    onCall();

}

public  void onCall()
{

    CustomAdapter ca = new CustomAdapter(this, names, description );

    ListView lt = (ListView)findViewById(R.id.list);

    lt.setAdapter(ca);

    lt.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            onCall();

            Intent profile = new Intent(MainActivity.this , ProfileLayout.class);

            profile.putExtra("name", names.get(position) );
            profile.putExtra("desc" , description.get(position));


            startActivity(profile);
        }
    });
}
}

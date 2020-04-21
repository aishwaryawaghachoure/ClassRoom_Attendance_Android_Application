package com.example.android.attendanceapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class select_Activity extends AppCompatActivity {
    Spinner spinner,spinner1;
    TextView tv;
    ArrayAdapter<CharSequence> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_);

        String name = getIntent().getExtras().getString("name");

        tv=(TextView)findViewById(R.id.textView4);
        spinner=(Spinner)findViewById(R.id.spinner);
        spinner1=(Spinner)findViewById(R.id.spinner2);

       adapter= ArrayAdapter.createFromResource(this,R.array.year_array,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        adapter=ArrayAdapter.createFromResource(this,R.array.div_array,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);

        tv.setText("WELCOME ! "+ name);
        Log.d("proceed11","completed");


    }

    public void on_proceed_click(View view)
    {

        Log.d("proceed","completed");
        Intent i = new Intent(this,proceed_activity.class);
        startActivity(i);
        finish();
    }
}

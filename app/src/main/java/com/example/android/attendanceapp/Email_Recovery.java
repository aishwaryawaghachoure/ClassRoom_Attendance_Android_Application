package com.example.android.attendanceapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Email_Recovery extends AppCompatActivity {

    Button b1,b2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email__recovery);
        b1 = (Button) findViewById(R.id.button_e);
        b2 = (Button) findViewById(R.id.button_e1);
    }


    public void on_Recover_password(View view) {

        //Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gmail.com"));
        //browser.putExtra("subject","password recovery");
        Intent i=new Intent(Intent.ACTION_SEND);
        i.setData(Uri.parse("mailto"));
        String[] To={"shubhkc131@gmail.com","aishwaryaw321@gmail.com"};
        i.putExtra(Intent.EXTRA_EMAIL,To);
        i.putExtra(Intent.EXTRA_SUBJECT,"Subject");
        i.putExtra(Intent.EXTRA_TEXT,"Problem logging in? Reset your Password here");
        i.setType("message/rfc822");
        startActivity(i);


        //startActivity(browser);
    }
    public void on_Cancel(View view)
    {
      Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
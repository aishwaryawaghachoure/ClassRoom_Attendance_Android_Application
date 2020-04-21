package com.example.android.attendanceapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText_name;
    EditText editText_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText_name=(EditText)findViewById(R.id.editText_name);
        editText_pass=(EditText)findViewById(R.id.editText_password);
    }
    public void on_login(View view)
    {
        String n=editText_name.getText().toString();
        String p=editText_pass.getText().toString();
        if(n.compareTo("Aish")==0 && p.compareTo("1")==0)
        {
            Intent i = new Intent(this,select_Activity.class);
            i.putExtra("name", n);
            startActivity(i);
            finish();
        }
        else
        {
            Toast.makeText(getBaseContext(),"incorrect username or password :(", Toast.LENGTH_LONG).show();
        }
    }
    public void on_forgotPassword(View view)
    {
        Intent intent=new Intent(this,Email_Recovery.class);
        startActivity(intent);


    }
    public void on_newUser(View view)
    {
        Intent b=new Intent(this,New_User.class);
        startActivity(b);
    }
    public void on_Recover_password()
    {

    }
}

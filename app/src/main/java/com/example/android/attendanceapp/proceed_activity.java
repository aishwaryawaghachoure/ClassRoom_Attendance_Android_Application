package com.example.android.attendanceapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class proceed_activity extends AppCompatActivity {
    public  ArrayList<Student> stud_details;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proceed_activity);
        Log.d("proceed","creating arraylist");

        stud_details = new ArrayList<Student>();
        stud_details.add(new Student("D", 1,false));/*,/* false*/
        stud_details.add(new Student("E", 2,false));/*, /*false*/
        stud_details.add(new Student("F", 3,false));/*, /*false*/
        stud_details.add(new Student("G", 4,false));/*,/* false*/
        stud_details.add(new Student("H", 5,false));/*,/* false*/
        stud_details.add(new Student("I", 6,false));/*,/* false*/
        stud_details.add(new Student("J", 7,false));/*,/* false*/
        stud_details.add(new Student("K", 8,false));/*, /*false*/
        stud_details.add(new Student("L", 9,false));/*,/* false*/
        stud_details.add(new Student("M", 10,false));/*,/* false*/
        Log.d("proceed","arraylist completed");

        // Create an {@link AndroidFlavorAdapter}, whose data source is a list of
        // {@link AndroidFlavor}s. The adapter knows how to create list item views for each item
        // in the list.
        StudentAdapter studAdapter = new StudentAdapter(this, stud_details
        );
        Log.d("proceed","completed1");

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.listview_stud);
        Log.d("proceed","completed2");

        listView.setAdapter(studAdapter);
    }
}

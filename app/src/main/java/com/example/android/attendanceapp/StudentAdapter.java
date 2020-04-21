package com.example.android.attendanceapp;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aishwarya Waghchoure on 19-09-2017.
 */

public class StudentAdapter extends ArrayAdapter<Student> {
   List<Student> checkboxItems;
    Context context;
    public StudentAdapter(Activity context, ArrayList<Student> stud)
    {

        super(context,0,stud);
        this.context=context;
        this.checkboxItems=stud;


    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        Log.d("proceed","in getview");

        View listItemView = convertView;

        //if(listItemView == null)
        //{
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        //}

        Student currentStudent = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.textView3);

        nameTextView.setText(currentStudent.getName());
        //Log.d("proceed","set text view completed");


        TextView numberTextView = (TextView) listItemView.findViewById(R.id.textView5);
        String rn=Integer.toString(currentStudent.getRoll_no());
       // Log.d("proceed","rn");
        numberTextView.setText(rn);
        Log.d("proceed"," set rollnocompleted");


      TextView cbTextView = (TextView) listItemView.findViewById(R.id.checkBox);

        Log.d("proceed","checkbox found");

        //cbTextView.setText((CharSequence) checkboxItems.get(position));




        Log.d("proceed","settingcompleted");

        return listItemView;
    }

}

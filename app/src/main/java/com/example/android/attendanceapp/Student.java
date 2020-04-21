package com.example.android.attendanceapp;

import android.util.Log;

/**
 * Created by Aishwarya Waghchoure on 19-09-2017.
 */

public class Student {

    String name;
    int roll_no;
    boolean cb;

    Student(String mname,int mroll_no,boolean mcb)
    {
        this.name=mname;
        this.roll_no=mroll_no;
        this.cb=mcb;
    }

    public String getName() {

        Log.d("proceed","getting name");
        return name;
    }

    public int getRoll_no() {
        Log.d("proceed","getting rollno");
        return roll_no;
    }

    public boolean getCb() {
        return cb;
    }
}

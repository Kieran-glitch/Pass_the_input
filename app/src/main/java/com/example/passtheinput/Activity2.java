package com.example.passtheinput;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    TextView t1;
    TextView t2;
    TextView t3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        String name=(String) savedInstanceState.getSerializable("Name");
        String number=(String) savedInstanceState.getSerializable("Number");
        String gender=(String) savedInstanceState.getSerializable("Gender");
        t1.setText(name);
        t2.setText(number);
        t3.setText(gender);
    }}

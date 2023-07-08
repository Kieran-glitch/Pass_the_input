package com.example.passtheinput;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et;
    EditText et1;
    EditText e2;
    Button btn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=findViewById(R.id.editTextText);
        et1=findViewById(R.id.editTextTextn);
        e2=findViewById(R.id.editTextText3);
        btn=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t=new Intent(MainActivity.this,Activity2.class);
                String name= et.getText().toString();
                String number= et1.getText().toString();
                String gender= e2.getText().toString();
                t.putExtra("Name",name);
                t.putExtra("Number",number);
                t.putExtra("Gender",gender);
                startActivity(t);
            }
        });
    }
}
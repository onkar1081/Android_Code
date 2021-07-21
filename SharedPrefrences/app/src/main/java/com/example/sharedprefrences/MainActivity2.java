package com.example.sharedprefrences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1=findViewById(R.id.textView);
        SharedPreferences sp;
        sp=getSharedPreferences("mysp",MODE_PRIVATE);
        String s1=sp.getString("fname","Value not found");
        t1.setText(s1);
    }
}
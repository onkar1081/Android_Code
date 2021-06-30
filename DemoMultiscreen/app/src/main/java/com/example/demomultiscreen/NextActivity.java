package com.example.demomultiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        tv=findViewById(R.id.textView);

        Intent it1= getIntent();
        Bundle b1=it1.getExtras();
        String s2=b1.getString("fname","testing");
        tv.setText("Hello "+s2);
    }
}
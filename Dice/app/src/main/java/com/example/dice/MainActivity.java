package com.example.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.btn_click);
        t1=findViewById(R.id.txt1);
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Random rn=new Random();
        int x=rn.nextInt(6)+1;
        t1.setText(""+x);
    }
}
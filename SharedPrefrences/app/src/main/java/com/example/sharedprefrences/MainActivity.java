package com.example.sharedprefrences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText tv;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.button);
        b2=findViewById(R.id.button2);
        tv=findViewById(R.id.e1);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                String n=tv.getText().toString();
                SharedPreferences sp;
                sp=getSharedPreferences("mysp",MODE_PRIVATE);
                SharedPreferences.Editor ed=sp.edit();
                ed.putString("fname",n);
                ed.commit();
                break;

            case R.id.button2:
                Intent it=new Intent(this,MainActivity2.class);
                startActivity(it);
                break;
        }
    }
}
package com.example.demomultiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1;
    EditText e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.button);
        e1=findViewById(R.id.edit1);
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String s1=e1.getText().toString();
        Intent it=new Intent(MainActivity.this,NextActivity.class);
        it.putExtra("fname",s1);
        startActivity(it);
    }
}
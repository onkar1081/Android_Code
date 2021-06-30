package com.example.demosubactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DemoActivity2 extends AppCompatActivity implements View.OnClickListener {
    Button b2;
    int add=0,x,y;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo2);
        b2=findViewById(R.id.Back);
        b2.setOnClickListener(this);
        Intent it2=getIntent();
        Bundle bl=it2.getExtras();
        x=bl.getInt("number1");
        y=bl.getInt("number2");
        add=x+y;
    }

    @Override
    public void finish() {
        Intent it2=new Intent(this,MainActivity.class);
        it2.putExtra("result",add);
        setResult(RESULT_OK,it2);
        super.finish();
    }

    @Override
    public void onClick(View v) {
        finish();
    }
}
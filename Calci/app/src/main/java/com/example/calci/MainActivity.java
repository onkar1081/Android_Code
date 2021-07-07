package com.example.calci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1,b2,b3,b4;
    EditText e1,e2,e3;
    String s1="",s2="";
    double n1,n2,res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.txt1);
        e2=findViewById(R.id.txt2);
        e3=findViewById(R.id.txt3);
        b1=findViewById(R.id.btnadd);
        b2=findViewById(R.id.btnsub);
        b3=findViewById(R.id.btnmult);
        b4=findViewById(R.id.btndiv);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnadd:
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                n1=Integer.parseInt(s1);
                n2=Integer.parseInt(s2);
                res=n1+n2;
                e3.setText(""+res);
                break;
            case R.id.btnsub:
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                n1=Integer.parseInt(s1);
                n2=Integer.parseInt(s2);
                res=n1-n2;
                e3.setText(""+res);
                break;
            case R.id.btnmult:
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                n1=Integer.parseInt(s1);
                n2=Integer.parseInt(s2);
                res=n1*n2;
                e3.setText(""+res);
                break;
            case R.id.btndiv:
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                n1=Integer.parseInt(s1);
                n2=Integer.parseInt(s2);
                res=n1/n2;
                e3.setText(""+res);
                break;
        }
    }
}
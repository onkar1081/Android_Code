package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15;
    TextView t1;
    String n1;
    int num1,num2,result,op,num3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0=findViewById(R.id.btn_0);
        b1=findViewById(R.id.btn_1);
        b2=findViewById(R.id.btn_2);
        b3=findViewById(R.id.btn_3);
        b4=findViewById(R.id.btn_4);
        b5=findViewById(R.id.btn_5);
        b6=findViewById(R.id.btn_6);
        b7=findViewById(R.id.btn_7);
        b8=findViewById(R.id.btn_8);
        b9=findViewById(R.id.btn_9);
        b10=findViewById(R.id.btn_plus);
        b11=findViewById(R.id.btn_minus);
        b12=findViewById(R.id.btn_mult);
        b13=findViewById(R.id.btn_div);
        b14=findViewById(R.id.btn_clear);
        b15=findViewById(R.id.btn_equal);
        t1=findViewById(R.id.txt);
        b0.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b10.setOnClickListener(this);
        b11.setOnClickListener(this);
        b12.setOnClickListener(this);
        b13.setOnClickListener(this);
        b14.setOnClickListener(this);
        b15.setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {
        n1 =t1.getText().toString();
        switch (v.getId()) {
            case R.id.btn_0:
                t1.setText(n1 + "0");
                break;
            case R.id.btn_1:
                t1.setText(n1 + "1");
                break;
            case R.id.btn_2:
                t1.setText(n1 + "2");
                break;
            case R.id.btn_3:
                t1.setText(n1 + "3");
                break;
            case R.id.btn_4:
                t1.setText(n1 + "4");
                break;
            case R.id.btn_5:
                t1.setText(n1 + "5");
                break;
            case R.id.btn_6:
                t1.setText(n1 + "6");
                break;
            case R.id.btn_7:
                t1.setText(n1 + "7");
                break;
            case R.id.btn_8:
                t1.setText(n1 + "8");
                break;
            case R.id.btn_9:
                t1.setText(n1 + "9");
                break;
            case R.id.btn_clear:
                t1.setText("");
                num1=0;
                num2=0;
                result=0;
                break;
            case R.id.btn_plus:
                op = 1;
                num1 = Integer.parseInt(t1.getText().toString());
                t1.setText("");
                break;
            case R.id.btn_minus:
                op = 2;
                num1 = Integer.parseInt(t1.getText().toString());
                t1.setText("");
                break;
            case R.id.btn_mult:
                op = 3;
                num1 = Integer.parseInt(t1.getText().toString());
                t1.setText("");
                break;
            case R.id.btn_div:
                op = 4;
                num1 = Integer.parseInt(t1.getText().toString());
                t1.setText("");
                break;
                public void operation(){
                num2 = Integer.parseInt(t1.getText().toString());
                if (op==1) {
                    result = num1 + num2;
                    t1.setText(""+result);
                }
                if (op==2) {
                    result = num1 - num2;
                    t1.setText(""+result);
                }
                if (op==3) {
                    result = num1 * num2;
                    t1.setText(""+result);
                }
                if (op==4) {
                    result = num1 / num2;
                    t1.setText(""+result);
                }
            }
            case R.id.btn_equal:

        }
    }

    }

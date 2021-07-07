package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    Button b1;
    CheckBox c1,c2,c3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.button);
        c1=findViewById(R.id.checkBox);
        c2=findViewById(R.id.checkBox2);
        c3=findViewById(R.id.checkBox3);
        b1.setOnClickListener(this);
        c1.setOnCheckedChangeListener(this);
        c2.setOnCheckedChangeListener(this);
        c3.setOnCheckedChangeListener(this);
        
    }

    @Override
    public void onClick(View v) {
        if(c1.isChecked()){
            Toast.makeText(this, "C is selected ", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "C is not selected ", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        String s1="";
        switch(buttonView.getId()){
            case R.id.checkBox:
                if(c1.isChecked()){
                    s1=s1+"C";
                    Toast.makeText(this, s1, Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this, s1, Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.checkBox2:
                if(c2.isChecked()){
                    s1=s1+",C++";
                    Toast.makeText(this, s1, Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this, s1, Toast.LENGTH_LONG).show();
                }
                break;

            case R.id.checkBox3:
                if(c3.isChecked()){
                    s1=s1+",JAVA";
                    Toast.makeText(this, s1, Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this, s1, Toast.LENGTH_LONG).show();
                }
                break;
        }
    }
}

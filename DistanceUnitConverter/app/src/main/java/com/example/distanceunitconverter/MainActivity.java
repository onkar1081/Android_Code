package com.example.distanceunitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1;
    EditText tv1,tv2;
    Spinner sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.button);
        tv1=findViewById(R.id.e1);
        tv2=findViewById(R.id.e2);
        sp=findViewById(R.id.spinner);
        String arr[]={"Select","Centimeter","Feet","Inches"};
        ArrayAdapter<CharSequence> ad;
        ad= new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,arr);
        sp.setAdapter(ad);
        b1.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        String s1 = tv1.getText().toString().trim();
        double meter = Double.parseDouble(s1);
        if (s1.equals("")) {
            tv1.setError("Please enter value");
        } else {
            switch (sp.getSelectedItemPosition()) {
                case 1:
                    double cm = Math.round(meter * 100);
                    tv2.setText(cm + " cm");
                    break;
                case 2:
                    double feet = Math.round(meter * 3.28);
                    tv2.setText(feet + " feet");
                    break;
                case 3:
                    double inch = Math.round(meter * 39.3);
                    tv2.setText(inch + " inches");
                    break;
            }
        }
    }
}
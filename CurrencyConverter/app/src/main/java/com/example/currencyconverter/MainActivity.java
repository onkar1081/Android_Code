package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText tv1, tv2;
    Button b1;
    RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button);
        tv1 = findViewById(R.id.e1);
        tv2 = findViewById(R.id.e2);
        rg = findViewById(R.id.radioGroup);
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String s1 = tv1.getText().toString().trim();
        if (s1.equals("")) {
            tv1.setError("Please enter value");
        } else {
            double value = Double.parseDouble(s1);
            switch (rg.getCheckedRadioButtonId()) {
                case R.id.radioButton1:
                    double dollar = Math.round(value / 74.26);
                    tv2.setText(dollar + " Dollars");
                    break;
                case R.id.radioButton2:
                    double rupees = Math.round(value * 74.26);
                    tv2.setText(rupees + " Rupees");
            }
        }
    }
}
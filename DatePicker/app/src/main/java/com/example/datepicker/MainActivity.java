package com.example.datepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener , DatePickerDialog.OnDateSetListener {
    TextView tv;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.textView);
        b1=findViewById(R.id.button);
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Calendar c;
        c=Calendar.getInstance();
        int d,m,y;
        d=c.get(Calendar.DAY_OF_MONTH);
        m=c.get(Calendar.MONTH);
        y=c.get(Calendar.YEAR);
        DatePickerDialog dp;
        dp=new DatePickerDialog(this,this,y,m,d);

        //c.set(2030,11,31);
       // dp.getDatePicker().setMaxDate(c.getTimeInMillis());
        dp.getDatePicker().setMaxDate(System.currentTimeMillis());
        c.set(2000,0,1);
        dp.getDatePicker().setMinDate(c.getTimeInMillis());

        dp.show();
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        month++;
        String s1=year+"/"+month+"/"+dayOfMonth;
        tv.setText(s1);
    }
}
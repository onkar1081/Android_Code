package com.example.timepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, TimePickerDialog.OnTimeSetListener {
    TextView tv;
    Button b1;
    TimePickerDialog tp;
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
        int hour,min;
        Calendar c;
        c=Calendar.getInstance();
        hour=c.get(Calendar.HOUR);
        min=c.get(Calendar.MINUTE);

        tp=new TimePickerDialog(this,this,hour,min,true);
        tp.show();
    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        String s1=hourOfDay+":"+minute;
        tv.setText(s1);
    }
}
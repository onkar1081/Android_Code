package com.example.demo_alarmmanager_rtc;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText tv;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.e1);
        b1=findViewById(R.id.button);
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String s1=tv.getText().toString();
        int time=Integer.parseInt(s1);
        Intent it=new Intent(this,MyReceiver.class);
        PendingIntent pd=PendingIntent.getBroadcast(this,123,it,0);

        AlarmManager am;
        am=(AlarmManager) getSystemService(ALARM_SERVICE);
        am.set(AlarmManager.RTC,System.currentTimeMillis()+time*1000,pd);
    }
}
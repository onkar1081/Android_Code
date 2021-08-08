package com.example.demo_alarmmanager_elapsedrealtime;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity  {
    EditText tv;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent it=new Intent(this,MyReceiver.class);
        PendingIntent pd=PendingIntent.getBroadcast(this,123,it,0);

        AlarmManager am;
        am=(AlarmManager) getSystemService(ALARM_SERVICE);
        am.setInexactRepeating(AlarmManager.ELAPSED_REALTIME, SystemClock.elapsedRealtime() +3*100,5*100,pd);
    }

}
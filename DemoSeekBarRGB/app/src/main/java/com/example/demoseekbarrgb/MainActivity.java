package com.example.demoseekbarrgb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {
    ConstraintLayout l1;
    SeekBar s1,s2,s3;
    int r,g,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l1=findViewById(R.id.layout1);
        s1=findViewById(R.id.seekBar);
        s2=findViewById(R.id.seekBar2);
        s3=findViewById(R.id.seekBar3);
        s1.setOnSeekBarChangeListener(this);
        s2.setOnSeekBarChangeListener(this);
        s3.setOnSeekBarChangeListener(this);


    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
         r=s1.getProgress();
         g=s2.getProgress();
         b=s3.getProgress();
        l1.setBackgroundColor(Color.rgb(r,g,b));
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }


}

package com.example.seekbardemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {
    TextView t1,t2;
    SeekBar s1,s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.textView);
        s1=findViewById(R.id.seekBar);
        t2=findViewById(R.id.textView3);
        s1.setOnSeekBarChangeListener(this);
    }
    int start,end,diff;
    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        t1.setText(""+progress);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        start=s1.getProgress();
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        end=s1.getProgress();
        diff=end-start;
        t2.setText(end+"-"+start+"="+diff);
    }
}
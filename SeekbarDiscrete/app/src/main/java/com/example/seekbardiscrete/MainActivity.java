package com.example.seekbardiscrete;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {
    TextView tv;
    SeekBar sb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.textView);
        sb=findViewById(R.id.seekBar);
        sb.setOnSeekBarChangeListener(this);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        tv.setText(""+progress);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
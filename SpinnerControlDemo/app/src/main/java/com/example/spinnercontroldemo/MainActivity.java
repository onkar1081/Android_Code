package com.example.spinnercontroldemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Spinner sp;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp=findViewById(R.id.spinner);
        b1=findViewById(R.id.btn);
        b1.setOnClickListener(this);
        ArrayAdapter<CharSequence> ad;
        ad=ArrayAdapter.createFromResource(this,R.array.branches,R.layout.support_simple_spinner_dropdown_item);
        sp.setAdapter(ad);
    }

    @Override
    public void onClick(View v) {
        String s1=sp.getSelectedItem().toString();
        Toast.makeText(this, s1, Toast.LENGTH_SHORT).show();
    }
}
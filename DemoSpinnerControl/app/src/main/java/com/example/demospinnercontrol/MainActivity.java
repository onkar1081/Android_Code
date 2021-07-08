package com.example.demospinnercontrol;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener ,AdapterView.OnItemSelectedListener {
    Spinner sp;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp=findViewById(R.id.spinner);
        b1=findViewById(R.id.button);
        b1.setOnClickListener(this);
        sp.setOnItemSelectedListener(this);
        String[] arr= {"CSE","ENTC","IT","MECH","CIVIL"};
        ArrayAdapter <String> ad;
        ad=new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,arr);
        sp.setAdapter(ad);

    }

    @Override
    public void onClick(View v) {
        String s1=sp.getSelectedItem().toString();
        Toast.makeText(this, s1, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String s1=sp.getSelectedItem().toString();
        Toast.makeText(this, s1+" "+position, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        Toast.makeText(this, "Not selected any item", Toast.LENGTH_SHORT).show();
    }
}
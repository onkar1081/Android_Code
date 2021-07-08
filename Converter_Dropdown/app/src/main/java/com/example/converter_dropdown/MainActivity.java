package com.example.converter_dropdown;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    EditText et;
    TextView tv;
    Spinner s1;
    String s2="";
    int km=0;
    int ans=0;
    String s10="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s1=findViewById(R.id.spinner);
        et=findViewById(R.id.e1);
        tv=findViewById(R.id.e2);
        s1.setOnItemSelectedListener(this);
        String[] arr= {"Select Option","Meter","Centimeter","Feet","Inch"};
        ArrayAdapter<String> ad;
        ad=new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,arr);
        s1.setAdapter(ad);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        s10=s1.getSelectedItem().toString();

        switch (s10){
            case "Meter":
                s2=et.getText().toString();
                s2.trim();
                km=Integer.parseInt(s2);
                ans=km*1000;
                tv.setText(""+ans);
                break;
            case "Centimeter":
                s2=et.getText().toString();
                km=Integer.parseInt(s2);
                ans=km*100000;
                tv.setText(""+ans);
                break;
            case "Feet":
                s2=et.getText().toString();
                km=Integer.parseInt(s2);
                ans=km*3280;
                tv.setText(""+ans);
                break;
            case "Inch":
                s2=et.getText().toString();
                km=Integer.parseInt(s2);
                ans=km*39370;
                tv.setText(""+ans);
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        Toast.makeText(this, "Nothing selected", Toast.LENGTH_SHORT).show();
    }
}

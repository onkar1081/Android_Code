package com.example.autocomplete_textview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    AutoCompleteTextView tv;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.e1);
        b1=findViewById(R.id.button);
        String [] values={"C","CPP","JAVA","JSP","PYTHON","Pycharm"};
        ArrayAdapter<String> ad;
        ad=new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,values);
        tv.setAdapter(ad);
        tv.setThreshold(1);
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String s1=tv.getText().toString();
        Toast.makeText(this, s1, Toast.LENGTH_SHORT).show();
    }
}
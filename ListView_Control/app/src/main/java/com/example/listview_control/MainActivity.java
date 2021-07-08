package com.example.listview_control;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.listview_control.R.layout.support_simple_spinner_dropdown_item;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.listview1);
        ArrayAdapter<CharSequence> ad;
        ad=ArrayAdapter.createFromResource(this,R.array.city, support_simple_spinner_dropdown_item);
        lv.setAdapter(ad);
        lv.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        TextView tv=(TextView)view;
        String s1=tv.getText().toString();
        Toast.makeText(this, s1, Toast.LENGTH_SHORT).show();
    }
}
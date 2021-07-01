package com.example.demo_website_opener;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b;
    EditText tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.b1);
        tv=findViewById(R.id.e1);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String s1=tv.getText().toString();
        Intent it=new Intent(Intent.ACTION_VIEW, Uri.parse(s1));
        startActivity(it);
    }
}
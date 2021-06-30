package com.example.phonecall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView t1;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.txt1);
        b1=findViewById(R.id.btn_click);
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String num=t1.getText().toString();
        Intent it =new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+num));
        startActivity(it);

    }
}
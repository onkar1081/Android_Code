package com.example.sms_sender;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText tv1,tv2;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=findViewById(R.id.e1);
        tv2=findViewById(R.id.e2);
        b=findViewById(R.id.button);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String s1=tv1.getText().toString();
        String s2=tv2.getText().toString();
        Intent it=new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:"+s1));
        it.putExtra("sms_body",s2);
        startActivity(it);
    }
}
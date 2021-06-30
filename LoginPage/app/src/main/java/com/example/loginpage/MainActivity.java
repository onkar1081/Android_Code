package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1;
    EditText t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.btn_click);
        t1=findViewById(R.id.txt1);
        t2=findViewById(R.id.pass);
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String un,pass;
        un=t1.getText().toString();
        pass=t2.getText().toString();
        if(un.equals("User") && pass.equals("Password")){
            //Toast.makeText(this, "Valid User", Toast.LENGTH_SHORT).show();
            Intent it=new Intent(this,MainActivity2.class);
            startActivity(it);
        }else{
            Toast.makeText(this, "Invalid User", Toast.LENGTH_SHORT).show();
        }
    }
}
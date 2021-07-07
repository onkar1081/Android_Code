package com.example.democallingsubactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText tv1,tv2;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=findViewById(R.id.e1);
        tv2=findViewById(R.id.e2);
        b1=findViewById(R.id.BACK);
        b1.setOnClickListener(this);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode,Intent data) {
        if(requestCode==123 && resultCode==RESULT_OK){
            Bundle bl1=data.getExtras();
            int r=bl1.getInt("result");
            Toast.makeText(this, ""+r, Toast.LENGTH_SHORT).show();
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void onClick(View v) {
        String s1=tv1.getText().toString();
        String s2=tv2.getText().toString();
        int n1=Integer.parseInt(s1);
        int n2=Integer.parseInt(s2);
        Intent it1=new Intent(this,NewActivity.class);
        it1.putExtra("number1",n1);
        it1.putExtra("number2",n2);
        startActivityForResult(it1,123);
    }
}
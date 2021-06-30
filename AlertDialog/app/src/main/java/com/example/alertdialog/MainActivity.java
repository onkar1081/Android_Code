package com.example.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, DialogInterface.OnClickListener {
    Button b1;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.button);
        tv=findViewById(R.id.textView);
        b1.setOnClickListener(this);
    }
    public void showdialog(){
        AlertDialog ad;
        ad=new AlertDialog.Builder(this).create();
        ad.setMessage("Do you want to exit ?");
        ad.setTitle("My App");
        ad.setButton(AlertDialog.BUTTON_POSITIVE,"Yes",this);
        ad.setButton(AlertDialog.BUTTON_NEGATIVE,"No",this);
        ad.setButton(AlertDialog.BUTTON_NEUTRAL,"Cancel",this);
        ad.setCancelable(false);
        ad.show();
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        showdialog();
    }

    @Override
    public void onClick(View v) {
        showdialog();
    }

    @Override
    public void onClick(DialogInterface dialog, int i) {
        String s1="";
        switch(i){
            case AlertDialog.BUTTON_POSITIVE:
                //s1="Yes";
                finish();
                break;
            case AlertDialog.BUTTON_NEGATIVE:
                s1="No";
                break;
            case AlertDialog.BUTTON_NEUTRAL:
                s1="Cancel";
        }
        tv.setText(s1);


    }
}
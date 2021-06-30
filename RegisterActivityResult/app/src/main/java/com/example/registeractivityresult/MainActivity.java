package com.example.registeractivityresult;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Instrumentation;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText tv1,tv2;
    Button b1;
    ActivityResultLauncher<Intent> launcher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=findViewById(R.id.e1);
        tv2=findViewById(R.id.e2);
        b1=findViewById(R.id.btn_next);
        b1.setOnClickListener(this);

        launcher=registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
            @Override
            public void onActivityResult(ActivityResult result) {
                if(result.getResultCode()==RESULT_OK){
                    Intent data =result.getData();
                    Bundle bl1=data.getExtras();
                    int r=bl1.getInt("result");
                    Toast.makeText(MainActivity.this, ""+r, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


    @Override
    public void onClick(View v) {
        String s1=tv1.getText().toString();
        String s2=tv2.getText().toString();
        int n1=Integer.parseInt(s1);
        int n2=Integer.parseInt(s2);
        Intent it1=new Intent(this,DemoActivity2.class);
        it1.putExtra("number1",n1);
        it1.putExtra("number2",n2);

        launcher.launch(it1);
    }
}
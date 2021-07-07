package com.example.helloworld;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextSwitcher;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */public class HelloWorld extends AppCompatActivity {
     Button b1;
     TextView tv;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.helloworld);
        b1=findViewById(R.id.button);
        tv=findViewById(R.id.textView2);
    }

    public void onClick(View view){
        tv.setText("Hello World");
    }
}

package com.example.webview_control_data;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button b1;
    WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.button);
        wv=findViewById(R.id.webView);
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
       wv.loadUrl("file:///android_asset/helloworld.html");
    }
}
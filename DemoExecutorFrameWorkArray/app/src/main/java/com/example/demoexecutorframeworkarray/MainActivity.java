package com.example.demoexecutorframeworkarray;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1;

    //    ExecutorService executor;
//    Handler handler=new Handler(Looper.getMainLooper());
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button);
        b1.setOnClickListener(this);

//        executor= Executors.newSingleThreadExecutor();
    }

    //
    @Override
    public void onClick(View v) {
        Intent it = new Intent(this, MainActivity2.class);
        startActivity(it);

//
//        executor.execute(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    URL url=new URL("https://jsonplaceholder.typicode.com/posts/");
//                    URLConnection con=url.openConnection();
//                    InputStream in=con.getInputStream();
//                    String s1="";
//                    int x;
//                    do{
//                        x=in.read();
//                        if(x!=-1){
//                            s1=s1+(char)x;
//                        }
//                    }while(x!=-1);
//                    in.close();
//                    String finalS = s1;
//                    handler.post(new Runnable() {
//                        @Override
//                        public void run() {
//                            try {
//                                JSONArray arr=new JSONArray(finalS);
//                                for(int i=0;i<arr.length();i++){
//                                    JSONObject json = arr.getJSONObject(i);
//                                    int userId = json.getInt("userId");
//                                    int id = json.getInt("id");
//                                    String title = json.getString("title");
//                                    String body = json.getString("body");
//                                    Log.i("JSONUserID",""+userId);
//                                    Log.i("JSONID",""+id);
//                                    Log.i("JSONTitle",""+title);
//                                    Log.i("JSONBody",""+body);
//                                }
//                            }
//                            catch (Exception e){
//                                Toast.makeText(MainActivity.this, ""+e, Toast.LENGTH_SHORT).show();
//                            }
//                        }
//                    });
//                }
//                catch (Exception e){
//
//                }
//            }
//        });
//
//    }
    }
}
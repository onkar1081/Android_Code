package com.example.demoexecutorframeworkarray;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ListView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainActivity2 extends AppCompatActivity  {
    ListView lv;
    ExecutorService executor;
    Handler handler=new Handler(Looper.getMainLooper());
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        lv=findViewById(R.id.listview);
        executor= Executors.newSingleThreadExecutor();
        Log.i("checking","first");

        executor.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    Log.i("checking","second");
                    URL url=new URL("https://jsonplaceholder.typicode.com/posts/");
                    URLConnection con=url.openConnection();
                    InputStream in=con.getInputStream();
                    String s1="";
                    Log.i("checking","third");
                    int x;
                    do{
                        x=in.read();
                        if(x!=-1){
                            s1=s1+(char)x;
                        }
                    }while(x!=-1);
                    Log.i("checking","four");
                    in.close();
                    String finalS = s1;
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            try {
                                Log.i("checking","five");
                                JSONArray arr=new JSONArray(finalS);
                                String[] arr1;
                                arr1 = new String[arr.length()];
                                Log.i("checking","six");
                                for(int i=0;i<arr.length();i++) {
                                    JSONObject json = arr.getJSONObject(i);
                                    int userId = json.getInt("userId");
                                    int id = json.getInt("id");
                                    String title = json.getString("title");
                                    String body = json.getString("body");
                                     arr1[i]=userId+","+id+","+title+","+body;
                                      Log.i("Elements inserted","done");
                                }
                                    ArrayAdapter ad;
                                    ad=new ArrayAdapter(MainActivity2.this,R.layout.support_simple_spinner_dropdown_item,arr1);
                                    lv.setAdapter(ad);
                                Log.i("Elements shown","done");
                            }
                            catch (Exception e){
                                Toast.makeText(MainActivity2.this, ""+e, Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
                catch (Exception e){

                }
            }
        });

    }
}
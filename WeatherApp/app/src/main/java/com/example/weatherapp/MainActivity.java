package com.example.weatherapp;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import org.json.JSONObject;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1;
    EditText t2,t3,t4;
    ImageView iv;
    ExecutorService executor;
    Handler handler=new Handler(Looper.getMainLooper());
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        b1=findViewById(R.id.button);
        t2=findViewById(R.id.e);
        t3=findViewById(R.id.e2);
        t4=findViewById(R.id.e3);
        iv=findViewById(R.id.imageView);
        b1.setOnClickListener(this);
        executor= Executors.newSingleThreadExecutor();
    }

    @Override
    public void onClick(View v) {

        executor.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    URL url=new URL("http://api.weatherapi.com/v1/current.json?key=5ed0e557186f4272852110057212008&q=India&aqi=no");
                    URLConnection con=url.openConnection();
                    InputStream in=con.getInputStream();
                    String s1="";
                    int x;
                    do{
                        x=in.read();
                        if(x!=-1){
                            s1=s1+(char)x;
                        }
                    }while(x!=-1);
                    in.close();
                    String finalS = s1;
                    handler.post(new Runnable() {
                        @RequiresApi(api = Build.VERSION_CODES.M)
                        @Override
                        public void run() {
                            try {
                                JSONObject json = new JSONObject(finalS);
                                String current= json.getString("current");
                                JSONObject json1 = new JSONObject(current);
                                String temperature=json1.getString("temp_c");
                                String cond=json1.getString("condition");
                                JSONObject json2 = new JSONObject(cond);
                                String weather=json2.getString("text");
                                String icon=json2.getString("icon");
                                URL url1 =new URL("https:"+icon);
                                Bitmap bmp= BitmapFactory.decodeStream(url1.openConnection().getInputStream());
                                iv.setImageBitmap(bmp);
                                String location=json.getString("location");
                                JSONObject json3 = new JSONObject(location);
                                String nameLoc=json3.getString("name");
                                String country=json3.getString("country");
                               t4.setText("" + temperature+" C");
                                t3.setText("" + weather);
                                t2.setText("" +nameLoc+", "+country );
                            }
                            catch (Exception e){
                                Toast.makeText(MainActivity.this, ""+e, Toast.LENGTH_SHORT).show();
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
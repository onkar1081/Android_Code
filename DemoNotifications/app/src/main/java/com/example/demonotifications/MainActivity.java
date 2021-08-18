package com.example.demonotifications;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationBuilderWithBuilderAccessor;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1;
    NotificationChannel nc;
    NotificationManager nm;
    String CHANNEL_ID="channel1";
    String  CHANNEL_NAME="mychannel";
    String GROUP_KEY="key1";
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.button);
        b1.setOnClickListener(this);
        nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        nc=new NotificationChannel(CHANNEL_ID,CHANNEL_NAME,NotificationManager.IMPORTANCE_HIGH);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onClick(View v) {

        createSingleNotification();
        createSingleNotification2();
        createSummary();
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    void createSingleNotification(){
        Intent it=new Intent(this,MainActivity2.class);
        PendingIntent pd=PendingIntent.getActivity(this,123,it,0);

        Notification.Builder builder;
        builder=new Notification.Builder(this,CHANNEL_ID);

        builder.setSmallIcon(R.drawable.ic_launcher_foreground);
        builder.setContentTitle("This is title 1");
        builder.setContentText("This is message 1!!!");
        builder.setChannelId(CHANNEL_ID);
        builder.setContentIntent(pd);
        builder.setAutoCancel(true);
        builder.setGroup(GROUP_KEY);
        
        Notification n=builder.build();

        nm.createNotificationChannel(nc);

        nm.notify(1,n);

    }
    @RequiresApi(api = Build.VERSION_CODES.O)
    void createSingleNotification2(){
        Intent it=new Intent(this,MainActivity2.class);
        PendingIntent pd=PendingIntent.getActivity(this,123,it,0);

        Notification.Builder builder;
        builder=new Notification.Builder(this,CHANNEL_ID);

        builder.setSmallIcon(R.drawable.ic_launcher_foreground);
        builder.setContentTitle("This is title 2");
        builder.setContentText("This is message 2!!!");
        builder.setChannelId(CHANNEL_ID);
        builder.setContentIntent(pd);
        builder.setAutoCancel(true);
        builder.setGroup(GROUP_KEY);
        
        Notification n=builder.build();

        nm.createNotificationChannel(nc);

        nm.notify(2,n);

        finish();
    }
    @RequiresApi(api = Build.VERSION_CODES.O)
    void createSummary(){
        Notification.Builder builder;
        builder=new Notification.Builder(this,CHANNEL_ID);
         builder.setSmallIcon(R.drawable.ic_launcher_foreground);
        builder.setAutoCancel(true);
        
        builder.setGroup(GROUP_KEY);
        builder.setGroupSummary(true);

        Notification.InboxStyle inboxStyle1 = new Notification.InboxStyle();
        inboxStyle1.setBigContentTitle("This is summary!!!!");
        inboxStyle1.setSummaryText("This is summary text!!!");
        builder.setStyle(inboxStyle1);
        Notification n=builder.build();

        nm.createNotificationChannel(nc);

        nm.notify(3,n);
        finish();
    }
}
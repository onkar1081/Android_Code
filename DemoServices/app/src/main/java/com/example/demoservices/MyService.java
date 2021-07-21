package com.example.demoservices;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;
import android.util.Log;
import android.widget.Toast;

public class MyService extends Service {
    String TAG="MyService";
    MediaPlayer player;
    public MyService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i(TAG,"On Create");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i(TAG,"OnStartCommand");
        Toast.makeText(this, "In Start", Toast.LENGTH_SHORT).show();
        player=MediaPlayer.create(this, R.raw.tone1);
        player.setLooping(true);
        player.start();
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        player.stop();
        Toast.makeText(this, "In Destroy", Toast.LENGTH_SHORT).show();
        Log.i(TAG,"OnDestroy");
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
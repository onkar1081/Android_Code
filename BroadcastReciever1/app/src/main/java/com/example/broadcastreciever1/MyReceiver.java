package com.example.broadcastreciever1;

import android.Manifest;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.core.app.ActivityCompat;

public class MyReceiver extends BroadcastReceiver {

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    public void onReceive(Context context, Intent intent) {
        boolean flag= Settings.Global.getInt(context.getContentResolver(),Settings.Global.AIRPLANE_MODE_ON,0)!=0;
        if(flag){
            Toast.makeText(context, "Airplane Mode On", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(context, "Airplane Mode Off", Toast.LENGTH_SHORT).show();
        }

    }
}
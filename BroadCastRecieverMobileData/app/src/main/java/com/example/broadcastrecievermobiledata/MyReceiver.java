package com.example.broadcastrecievermobiledata;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Mobile data connectivity changed", Toast.LENGTH_SHORT).show();
    }
}
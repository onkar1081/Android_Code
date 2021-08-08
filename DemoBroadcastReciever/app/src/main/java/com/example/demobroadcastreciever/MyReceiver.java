package com.example.demobroadcastreciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle ob=intent.getExtras();
        String num=ob.getString(TelephonyManager.EXTRA_INCOMING_NUMBER);
        Toast.makeText(context, "Call Recieved from "+num, Toast.LENGTH_SHORT).show();

    }
}
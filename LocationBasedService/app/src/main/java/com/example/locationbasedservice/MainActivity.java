package com.example.locationbasedservice;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements LocationListener {
    LocationManager lm;
    EditText et1,et2;
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.e1);
        et2=findViewById(R.id.e2);
        lm = (LocationManager) getSystemService(LOCATION_SERVICE);
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            requestPermissions(new String[]{Manifest.permission.ACCESS_FINE_LOCATION,Manifest.permission.ACCESS_COARSE_LOCATION},123);
            return;
        }
        lm.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 100, 0, this);
    }

    @Override
    public void onLocationChanged(@NonNull Location location) {
        double lat,lng;
        lat=location.getLatitude();
        lng=location.getLongitude();
        et1.setText(""+lat);
        et2.setText(""+lng);
    }
}
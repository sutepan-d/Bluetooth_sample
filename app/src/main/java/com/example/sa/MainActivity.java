package com.example.sa;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BroadcastReceiver br = new BluetoothReceiver();
        IntentFilter filter = new IntentFilter(POWER_SERVICE);
        filter.addAction(Intent.ACTION_POWER_CONNECTED);
        this.registerReceiver(br, filter);
    }
}
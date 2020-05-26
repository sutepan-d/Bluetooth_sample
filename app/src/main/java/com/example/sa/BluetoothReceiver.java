package com.example.sa;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import static androidx.core.app.ActivityCompat.startActivityForResult;

public class BluetoothReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String stat;
        BluetoothAdapter bluetooth = BluetoothAdapter.getDefaultAdapter();
        if (bluetooth.isEnabled()) {
            String address = bluetooth.getAddress();
            String name = bluetooth.getName();
            stat = name + " : " + address;
            Toast.makeText(context, stat, Toast.LENGTH_LONG).show();
        }
        throw new UnsupportedOperationException("Not yet implemented");
    }
}

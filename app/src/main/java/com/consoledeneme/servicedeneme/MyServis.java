package com.consoledeneme.servicedeneme;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyServis extends Service {

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }


    @Override
    public void onCreate() {
        Toast.makeText(this,"Servis Çalışmaya Başlaı",Toast.LENGTH_LONG).show();
        System.out.println("swich servis");
    }

    @Override
    public void onDestroy() {
        Toast.makeText(this,"Servis Durduruldu",Toast.LENGTH_LONG).show();
    }
}
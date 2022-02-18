package com.example.md51;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {

    final String LOGTAG = "Log";

    @Override
    public void onCreate() {
        Log.d(LOGTAG, "onCreate");
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(LOGTAG, "onStartCommand");
        return super.onStartCommand(intent, flags, startId);
    }
    @Override
    public void onDestroy() {
        Log.d(LOGTAG, "onDestroy");
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.d(LOGTAG, "onBind");
        return null;
    }

    public boolean onUnbind(Intent intent) {
        Log.d(LOGTAG, "onUnbind");
        return super.onUnbind(intent);
    }

}
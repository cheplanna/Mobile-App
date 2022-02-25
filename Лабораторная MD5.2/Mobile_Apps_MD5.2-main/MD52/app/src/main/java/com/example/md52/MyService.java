package com.example.md52;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import androidx.core.app.NotificationCompat;

public class MyService extends Service {

    @Override
    public void onCreate() {
        super.onCreate();
    }
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        Intent Intent = new Intent(this, MainActivity2.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this,
                0, Intent,
                PendingIntent.FLAG_CANCEL_CURRENT);

        Intent Intent2 = new Intent(this, MainActivity3.class);
        PendingIntent pendingIntent2 = PendingIntent.getActivity(this,
                0, Intent2,
                PendingIntent.FLAG_CANCEL_CURRENT);

        NotificationCompat.Builder builder =
                new NotificationCompat.Builder(this)
                        .setSmallIcon(R.drawable.ic_stat_name)
                        .setContentTitle("Уведомление")
                        .setContentText("Уведомление от сервиса")
                        .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                        .addAction(R.drawable.ic_1, "Окно 1", pendingIntent)
                        .addAction(R.drawable.ic_2, "Окно 2", pendingIntent2)
                        .setAutoCancel(true);

        Notification notification = builder.build();
        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notificationManager.notify(1,notification);
        startForeground(1, notification);
        return super.onStartCommand(intent,flags,startId);
    }
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
package com.JHLEE.myapplication2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    NotificationManager notificationManager;
    NotificationCompat.Builder builder = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        Intent intent = getIntent();
        if(intent != null) {//푸시알림을 선택해서 실행한것이 아닌경우 예외처리
            String notificationData = intent.getStringExtra("test");
            if(notificationData != null)
                Log.d("FCM_TEST", notificationData);
        }
        */
        final String chID = "123456";
        Intent intent = new Intent(this, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 10, intent, PendingIntent.FLAG_CANCEL_CURRENT);
        notificationManager = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        builder = new NotificationCompat.Builder(this, chID);
        builder.setSmallIcon(R.drawable.ex);
        builder.setContentTitle("제목");
        builder.setContentText("내용");
        builder.setAutoCancel(true);
        builder.setContentIntent(pendingIntent);
        notificationManager.notify(222, builder.build());
        Button B = (Button)findViewById(R.id.qwd);
        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notificationManager.notify(222, builder.build());
            }
        });



        /*
        String chName = "654321";
        String chDes = "hhhhhhhhhhhhhhh";

        NotificationChannel channel = null;
        channel = new NotificationChannel(chID, chName, NotificationManager.IMPORTANCE_HIGH);

        */


    }
}
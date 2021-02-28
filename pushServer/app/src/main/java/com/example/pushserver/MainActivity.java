package com.example.pushserver;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    NotificationManager notificationManager;

    PendingIntent intent;

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

        Button B = (Button)findViewById(R.id.bt);
        final String ch = "1235";

        intent = PendingIntent.getActivity(MainActivity.this, 0,

                new Intent(getApplicationContext(), MainActivity.class), PendingIntent.FLAG_UPDATE_CURRENT);
        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.example);




                NotificationCompat.Builder builder = new NotificationCompat.Builder(MainActivity.this, ch)
                        .setSmallIcon(R.drawable.example) // 아이콘 설정하지 않으면 오류남
                        .setDefaults(Notification.DEFAULT_ALL)
                        .setContentTitle("알림 제목") // 제목 설정
                        .setContentText("알림 내용") // 내용 설정
                        .setAutoCancel(true)
                        .setContentIntent(intent);


                NotificationManager notificationManager = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
                notificationManager.notify(0, builder.build());

            }
        });

        }
}
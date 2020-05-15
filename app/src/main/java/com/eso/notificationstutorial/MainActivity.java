package com.eso.notificationstutorial;

import android.app.Notification;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import static com.eso.notificationstutorial.utils.myApplication.CHANNEL_1_ID;
import static com.eso.notificationstutorial.utils.myApplication.CHANNEL_2_ID;

public class MainActivity extends AppCompatActivity {

    NotificationManagerCompat managerCompat;
    private EditText mTitleEt;
    private EditText mMessageEt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        managerCompat = NotificationManagerCompat.from(this);
        mTitleEt = findViewById(R.id.titleEt);
        mMessageEt = findViewById(R.id.messageEt);
    }

    public void sendOnChannel1(View view) {
        String title = mTitleEt.getText().toString().trim();
        String message = mMessageEt.getText().toString().trim();

        Notification notification = new NotificationCompat.Builder(this,CHANNEL_1_ID)
                .setSmallIcon(R.drawable.ic_one)
                .setContentTitle(title)
                .setContentText(message)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                .build();
        managerCompat.notify(1,notification);
    }

    public void sendOnChannel2(View view) {
        String title = mTitleEt.getText().toString().trim();
        String message = mMessageEt.getText().toString().trim();

        Notification notification = new NotificationCompat.Builder(this,CHANNEL_2_ID)
                .setSmallIcon(R.drawable.ic_two)
                .setContentTitle(title)
                .setContentText(message)
                .setPriority(NotificationCompat.PRIORITY_LOW)
                .build();
        managerCompat.notify(2,notification);
    }
}

/*Notifications Tutorial Part 1 - NOTIFICATION CHANNELS - Android Studio Tutorial
 * Notifications Tutorial Part 2 - ACTION BUTTONS & COLOR - Android Studio Tutorial
 * Notifications Tutorial Part 3 - BIG TEXT STYLE + INBOX STYLE - Android Studio Tutorial
 * Notifications Tutorial Part 4 - BIG PICTURE STYLE + MEDIA STYLE - Android Studio Tutorial
 * Notifications Tutorial Part 5 - MESSAGING STYLE + DIRECT REPLY - Android Studio Tutorial
 * Notifications Tutorial Part 6 - PROGRESS BAR NOTIFICATION - Android Studio Tutorial
 * Notifications Tutorial Part 7 - NOTIFICATION GROUPS - Android Studio Tutorial
 * Notifications Tutorial Part 8 - NOTIFICATION CHANNEL GROUPS - Android Studio Tutorial
 * Notifications Tutorial Part 9 - NOTIFICATION CHANNEL SETTINGS - Android Studio Tutorial
 * Notifications Tutorial Part 10 - DELETE NOTIFICATION CHANNELS - Android Studio Tutorial*/
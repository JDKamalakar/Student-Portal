package com.example.collegeportal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.example.collegeportal.databinding.ActivityNotificationBinding;

import java.util.ArrayList;
import java.util.List;

public class NotificationActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<NotificationDataClass> dataList;
    ListAdapterNotification adapter;
    NotificationDataClass androidData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        recyclerView = findViewById(R.id.notificationList);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(NotificationActivity.this, 1);
        recyclerView.setLayoutManager(gridLayoutManager);
        dataList = new ArrayList<>();
        androidData = new NotificationDataClass(R.string.Notification_1,R.drawable.ic_baseline_notifications_active_24,R.string.Time_1);
        dataList.add(androidData);
        androidData = new NotificationDataClass(R.string.Notification_2,R.drawable.ic_baseline_notifications_active_24,R.string.Time_2);
        dataList.add(androidData);
        androidData = new NotificationDataClass(R.string.Notification_3,R.drawable.ic_baseline_lens_24,R.string.Time_3);
        dataList.add(androidData);
        androidData = new NotificationDataClass(R.string.Notification_4,R.drawable.ic_baseline_lens_24,R.string.Time_4);
        dataList.add(androidData);
        androidData = new NotificationDataClass(R.string.Notification_5,R.drawable.ic_baseline_lens_24,R.string.Time_5);
        dataList.add(androidData);
        androidData = new NotificationDataClass(R.string.Notification_6,R.drawable.ic_baseline_lens_24,R.string.Time_6);
        dataList.add(androidData);
        androidData = new NotificationDataClass(R.string.Notification_7,R.drawable.ic_baseline_lens_24,R.string.Time_7);
        dataList.add(androidData);
        adapter = new ListAdapterNotification(NotificationActivity.this, dataList);
        recyclerView.setAdapter(adapter);
    }
}
package com.example.collegeportal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;

import com.example.collegeportal.databinding.ActivityContactDetailBinding;
import com.example.collegeportal.databinding.ActivityNotificationBinding;
import com.example.collegeportal.databinding.ActivityNotificationDetailBinding;

public class DetailedActivityNotification extends AppCompatActivity {
    @NonNull
    ActivityNotificationDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNotificationDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intent = this.getIntent();
        if (intent != null) {
            int name = intent.getIntExtra("name", R.string.Professor_1_Title);
            int detail = intent.getIntExtra("details", R.string.Professor_1);
            int contact = intent.getIntExtra("contact", R.string.Professor_1_Contact);
            int image = intent.getIntExtra("image", R.drawable.ic_baseline_person_24);
            binding.notificationTitle.setText(name);
            binding.notificationSendDetail.setText(contact);
            binding.notificationDetail.setText(detail);
            binding.notificationImage.setImageResource(image);
        }
    }
}
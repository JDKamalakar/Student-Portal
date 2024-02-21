package com.example.collegeportal;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        CardView issuedCard = findViewById(R.id.issuedCard);
        issuedCard.setOnClickListener(view -> {
            Intent intent = new Intent(LibraryActivity.this, IssuedActivity.class);
            startActivity(intent);
        });

        CardView dueCard = findViewById(R.id.dueCard);
        dueCard.setOnClickListener(view -> {
            Intent intent = new Intent(LibraryActivity.this, DueActivity.class);
            startActivity(intent);
        });

        CardView historyCard = findViewById(R.id.historyCard);
        historyCard.setOnClickListener(view -> {
            Intent intent = new Intent(LibraryActivity.this, IssuedHistoryActivity.class);
            startActivity(intent);
        });

        CardView requestCard = findViewById(R.id.requestCard);
        requestCard.setOnClickListener(view -> {
            Intent intent = new Intent(LibraryActivity.this, RequestActivity.class);
            startActivity(intent);
        });
    }
}
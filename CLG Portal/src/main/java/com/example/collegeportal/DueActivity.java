package com.example.collegeportal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class DueActivity extends AppCompatActivity {



    RecyclerView recyclerView;
    List<LibraryDataClass> dataList;
    LibraryAdapter adapter;
    LibraryDataClass androidData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_due);
        recyclerView = findViewById(R.id.issuedView);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(DueActivity.this, 1);
        recyclerView.setLayoutManager(gridLayoutManager);
        dataList = new ArrayList<>();
        androidData = new LibraryDataClass(R.string.Book_1, R.string.Book_1_Date);
        dataList.add(androidData);
        androidData = new LibraryDataClass(R.string.Book_2, R.string.Book_2_Date);
        dataList.add(androidData);
        androidData = new LibraryDataClass(R.string.Book_3, R.string.Book_3_Date);
        dataList.add(androidData);
        androidData = new LibraryDataClass(R.string.Book_4, R.string.Book_4_Date);
        dataList.add(androidData);
        androidData = new LibraryDataClass(R.string.Book_5, R.string.Book_5_Date);
        dataList.add(androidData);
        androidData = new LibraryDataClass(R.string.Book_6, R.string.Book_6_Date);
        dataList.add(androidData);
        adapter = new LibraryAdapter(DueActivity.this, dataList,true);
        recyclerView.setAdapter(adapter);
    }
}
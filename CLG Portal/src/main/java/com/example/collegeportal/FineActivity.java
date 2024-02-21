package com.example.collegeportal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class FineActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<FeesDataClass> dataList;
    FeesAdapter adapter;
    FeesDataClass androidData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fine);
        recyclerView = findViewById(R.id.feesView);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(FineActivity.this, 1);
        recyclerView.setLayoutManager(gridLayoutManager);
        dataList = new ArrayList<>();
        androidData = new FeesDataClass(R.string.Fees_1, R.string.Fees_1_Amount);
        dataList.add(androidData);
        androidData = new FeesDataClass(R.string.Fees_2, R.string.Fees_2_Amount);
        dataList.add(androidData);
        androidData = new FeesDataClass(R.string.Fees_3, R.string.Fees_3_Amount);
        dataList.add(androidData);
        androidData = new FeesDataClass(R.string.Fees_4, R.string.Fees_4_Amount);
        dataList.add(androidData);
        androidData = new FeesDataClass(R.string.Fees_5, R.string.Fees_5_Amount);
        dataList.add(androidData);
        androidData = new FeesDataClass(R.string.Fees_6, R.string.Fees_6_Amount);
        dataList.add(androidData);
        adapter = new FeesAdapter(FineActivity.this, dataList);
        recyclerView.setAdapter(adapter);
    }
}
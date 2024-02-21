package com.example.collegeportal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class PayActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<FeesDataClass> dataList;
    FeesAdapter adapter;
    FeesDataClass androidData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);
        recyclerView = findViewById(R.id.feesView);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(PayActivity.this, 1);
        recyclerView.setLayoutManager(gridLayoutManager);
        dataList = new ArrayList<>();
        androidData = new FeesDataClass(R.string.Fees_6, R.string.Fees_6_Amount);
        dataList.add(androidData);
        adapter = new FeesAdapter(PayActivity.this, dataList);
        recyclerView.setAdapter(adapter);
    }
}
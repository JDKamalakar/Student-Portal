package com.example.collegeportal;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ResultActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<ResultDataClass> dataList;
    ResultAdapter adapter;
    ResultDataClass androidData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        recyclerView = findViewById(R.id.semResult);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(ResultActivity.this, 1);
        recyclerView.setLayoutManager(gridLayoutManager);
        dataList = new ArrayList<>();
        androidData = new ResultDataClass(R.string.Sem_8,R.string.SGPA_8, R.string.Back_8);
        dataList.add(androidData);
        androidData = new ResultDataClass(R.string.Sem_7,R.string.SGPA_7,R.string.Back_7);
        dataList.add(androidData);
        androidData = new ResultDataClass(R.string.Sem_6,R.string.SGPA_6,R.string.Back_6);
        dataList.add(androidData);
        androidData = new ResultDataClass(R.string.Sem_5,R.string.SGPA_5,R.string.Back_5);
        dataList.add(androidData);
        androidData = new ResultDataClass(R.string.Sem_4,R.string.SGPA_4,R.string.Back_4);
        dataList.add(androidData);
        androidData = new ResultDataClass(R.string.Sem_3,R.string.SGPA_3,R.string.Back_3);
        dataList.add(androidData);
        adapter = new ResultAdapter(ResultActivity.this, dataList);
        recyclerView.setAdapter(adapter);
    }
}
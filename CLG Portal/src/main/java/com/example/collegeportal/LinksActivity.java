package com.example.collegeportal;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class LinksActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<LinkDataClass> dataList;
    LinkAdapter adapter;
    LinkDataClass androidData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_links);
        recyclerView = findViewById(R.id.linkView);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(LinksActivity.this, 1);
        recyclerView.setLayoutManager(gridLayoutManager);
        dataList = new ArrayList<>();
        androidData = new LinkDataClass(R.string.Link_Title_1);
        dataList.add(androidData);
        androidData = new LinkDataClass(R.string.Link_Title_2);
        dataList.add(androidData);
        androidData = new LinkDataClass(R.string.Link_Title_3);
        dataList.add(androidData);
        androidData = new LinkDataClass(R.string.Link_Title_4);
        dataList.add(androidData);
        androidData = new LinkDataClass(R.string.Link_Title_5);
        dataList.add(androidData);
        androidData = new LinkDataClass(R.string.Link_Title_6);
        dataList.add(androidData);
        adapter = new LinkAdapter(LinksActivity.this, dataList);
        recyclerView.setAdapter(adapter);
    }
}
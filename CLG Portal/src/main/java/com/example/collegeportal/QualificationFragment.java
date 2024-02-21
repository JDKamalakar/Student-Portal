package com.example.collegeportal;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class QualificationFragment extends Fragment {

    RecyclerView recyclerView;
    List<QualificationDataClass> dataList;
    QualificationAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_qualification, container, false);

        recyclerView = view.findViewById(R.id.qualification_recyclerView);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 1);
        recyclerView.setLayoutManager(gridLayoutManager);

        dataList = new ArrayList<>();
        QualificationDataClass androidData = new QualificationDataClass("SSC", "SSC - SSC", "CID", "PASS", "GSEB", "SVVM", "2020 - 2021", "26SCHG", "100", "50", "50%", "Tokyo", "Tokyo", "Japan", "Japanese");
        dataList.add(androidData);

        adapter = new QualificationAdapter(getContext(), dataList);
        recyclerView.setAdapter(adapter);

        return view;
    }

}
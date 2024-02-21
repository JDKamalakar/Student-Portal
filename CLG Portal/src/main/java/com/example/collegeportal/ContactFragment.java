package com.example.collegeportal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.collegeportal.databinding.FragmentContactBinding;

import java.util.ArrayList;
import java.util.List;

public class ContactFragment extends Fragment {
    RecyclerView recyclerView;
    List<ContactDataClass> dataList;
    ContactAdapter adapter;
    ContactDataClass androidData;
    SearchView searchView;
    CardView cardView;
    FragmentContactBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentContactBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        recyclerView = view.findViewById(R.id.contactList);
        searchView = view.findViewById(R.id.search_contact);
        searchView.setQueryHint("Search Contact...");
        searchView.clearFocus();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }
            @Override
            public boolean onQueryTextChange(String newText) {
                searchList(newText);
                return true;
            }
        });
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 1);
        recyclerView.setLayoutManager(gridLayoutManager);
        dataList = new ArrayList<>();
        androidData = new ContactDataClass(R.string.Professor_1_Title, R.drawable.ic_baseline_person_24);
        dataList.add(androidData);
        androidData = new ContactDataClass(R.string.Professor_2_Title, R.drawable.ic_baseline_person_24);
        dataList.add(androidData);
        androidData = new ContactDataClass(R.string.Professor_3_Title, R.drawable.ic_baseline_person_24);
        dataList.add(androidData);
        androidData = new ContactDataClass(R.string.Professor_4_Title, R.drawable.ic_baseline_person_24);
        dataList.add(androidData);
        androidData = new ContactDataClass(R.string.Professor_5_Title, R.drawable.ic_baseline_person_24);
        dataList.add(androidData);
        adapter = new ContactAdapter(getActivity(), dataList);
        recyclerView.setAdapter(adapter);
        return view;
    }

    private void searchList(String text){
        List<ContactDataClass> dataSearchList = new ArrayList<>();
        for (ContactDataClass data : dataList){
            String name = getString(data.getListName()); // get the string value from the resource ID
            if (name.toLowerCase().contains(text.toLowerCase())) {
                dataSearchList.add(data);
            }
        }
        if (dataSearchList.isEmpty()){
            Toast.makeText(getActivity(), "Not Found", Toast.LENGTH_SHORT).show();
        } else {
            adapter.setSearchList(dataSearchList);
        }
    }
}
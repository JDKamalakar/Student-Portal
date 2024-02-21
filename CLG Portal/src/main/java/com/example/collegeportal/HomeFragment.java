package com.example.collegeportal;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.collegeportal.databinding.ActivityNotificationBinding;

public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        CardView notificationCard = rootView.findViewById(R.id.notificationCard);
        notificationCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), NotificationActivity.class);
                startActivity(intent);
            }
        });

        CardView settingCard = rootView.findViewById(R.id.settingCard);
        settingCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ActivitySetting.class);
                startActivity(intent);
            }
        });

        CardView materialCard = rootView.findViewById(R.id.libraryCard);
        materialCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), LibraryActivity.class);
                startActivity(intent);
            }
        });

        CardView resultCard = rootView.findViewById(R.id.resultCard);
        resultCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ResultActivity.class);
                startActivity(intent);
            }
        });

        CardView pendingCard = rootView.findViewById(R.id.pendingCard);
        pendingCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), PendingActivity.class);
                startActivity(intent);
            }
        });

        CardView linksCard = rootView.findViewById(R.id.linksCard);
        linksCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), LinksActivity.class);
                startActivity(intent);
            }
        });

        return rootView;
    }
}
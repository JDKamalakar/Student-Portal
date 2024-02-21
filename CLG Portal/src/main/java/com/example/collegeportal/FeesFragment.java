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

public class FeesFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_fees, container, false);


        CardView historyCard = rootView.findViewById(R.id.historyCard);
        historyCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), HistoryActivity.class);
                startActivity(intent);
            }
        });

        CardView pending_payCard = rootView.findViewById(R.id.pending_payCard);
        pending_payCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), PendingPayActivity.class);
                startActivity(intent);
            }
        });

        CardView fineCard = rootView.findViewById(R.id.fineCard);
        fineCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), FineActivity.class);
                startActivity(intent);
            }
        });

        CardView payCard = rootView.findViewById(R.id.payCard);
        payCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), PayActivity.class);
                startActivity(intent);
            }
        });

        return rootView;
    }
}
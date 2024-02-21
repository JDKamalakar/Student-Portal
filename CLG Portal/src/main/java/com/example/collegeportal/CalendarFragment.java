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

public class CalendarFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_calendar, container, false);


        CardView attCard = rootView.findViewById(R.id.attCard);
        attCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), AttendanceActivity.class);
                startActivity(intent);
            }
        });

        CardView ttCard = rootView.findViewById(R.id.ttCard);
        ttCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), TimeTableActivity.class);
                startActivity(intent);
            }
        });

        CardView calendarCard = rootView.findViewById(R.id.calendarCard);
        calendarCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), AcaCalendarActivity.class);
                startActivity(intent);
            }
        });

        CardView scheduleCard = rootView.findViewById(R.id.scheduleCard);
        scheduleCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ScheduleActivity.class);
                startActivity(intent);
            }
        });

        return rootView;
    }
}
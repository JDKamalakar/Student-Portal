package com.example.collegeportal;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import android.view.View;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity implements View.OnClickListener {

    TextView viewPersonal, viewAdmission, view_studentContact, viewParent, viewQulify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        viewPersonal = findViewById(R.id.viewPersonal);
        viewAdmission = findViewById(R.id.viewAdmission);
        view_studentContact = findViewById(R.id.view_studentContact);
        viewParent = findViewById(R.id.viewParent);
        viewQulify = findViewById(R.id.viewQulify);

        viewPersonal.setOnClickListener(this);
        viewAdmission.setOnClickListener(this);
        view_studentContact.setOnClickListener(this);
        viewParent.setOnClickListener(this);
        viewQulify.setOnClickListener(this);

        // Set PersonalFragment as the default fragment
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.fragment_container, new PersonalFragment());
        ft.commit();
    }

    @Override
    public void onClick(View view) {
        Fragment fragment = null;

        switch (view.getId()) {
            case R.id.viewPersonal:
                fragment = new PersonalFragment();
                break;

            case R.id.viewAdmission:
                fragment = new AdmissionFragment();
                break;

            case R.id.view_studentContact:
                fragment = new StudentContactFragment();
                break;

            case R.id.viewParent:
                fragment = new ParentFragment();
                break;

            case R.id.viewQulify:
                fragment = new QualificationFragment();
                break;
        }

        if (fragment != null) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.fragment_container, fragment);

            // Set the text style for the active fragment title
            viewPersonal.setTypeface(null, Typeface.NORMAL);
            viewAdmission.setTypeface(null, Typeface.NORMAL);
            view_studentContact.setTypeface(null, Typeface.NORMAL);
            viewParent.setTypeface(null, Typeface.NORMAL);
            viewQulify.setTypeface(null, Typeface.NORMAL);
            ((TextView) view).setTypeface(null, Typeface.BOLD);

            // Set the background style for the active fragment title
            Drawable activeBackground = getResources().getDrawable(R.drawable.profilefragment_style);
            Drawable inactiveBackground = getResources().getDrawable(R.drawable.fragment_nostyle);
            int activeColor = getResources().getColor(R.color.black);
            int inactiveColor = getResources().getColor(R.color.dark_gray);
            viewPersonal.setBackground(view == viewPersonal ? activeBackground : inactiveBackground);
            viewAdmission.setBackground(view == viewAdmission ? activeBackground : inactiveBackground);
            view_studentContact.setBackground(view == view_studentContact ? activeBackground : inactiveBackground);
            viewParent.setBackground(view == viewParent ? activeBackground : inactiveBackground);
            viewQulify.setBackground(view == viewQulify ? activeBackground : inactiveBackground);
            viewPersonal.setTextColor(view == viewPersonal ? activeColor : inactiveColor);
            viewAdmission.setTextColor(view == viewAdmission ? activeColor : inactiveColor);
            view_studentContact.setTextColor(view == view_studentContact ? activeColor : inactiveColor);
            viewParent.setTextColor(view == viewParent ? activeColor : inactiveColor);
            viewQulify.setTextColor(view == viewQulify ? activeColor : inactiveColor);
            ft.commit();
        }
    }
}
package com.example.collegeportal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.collegeportal.databinding.ActivityBottomNavigationBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.AuthResult;
import android.widget.Button;


public class BottomActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    private ActivityBottomNavigationBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        binding = ActivityBottomNavigationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new HomeFragment());
        binding.bottomNavigationView.setBackground(null);
        binding.bottomNavigationView.setOnNavigationItemSelectedListener(this);

        binding.quickAccess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showBottomDialog();
            }
        });

    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout, fragment);
        fragmentTransaction.commit();
    }
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.home:
                replaceFragment(new HomeFragment());
                break;
            case R.id.calender:
                replaceFragment(new CalendarFragment());
                break;
            case R.id.contact:
                replaceFragment(new ContactFragment());
                break;
            case R.id.fees:
                replaceFragment(new FeesFragment());
                break;
        }
        return true;
    }

    private FirebaseAuth Auth;
    private Button SignoutButton;
    private void showBottomDialog() {
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.bottomsheet_layout);

        LinearLayout profileQuick = dialog.findViewById(R.id.quickProfile);
        LinearLayout attQuick = dialog.findViewById(R.id.quickAtt);
        LinearLayout webQuick = dialog.findViewById(R.id.quickWeb);
        Button buttonOut = dialog.findViewById(R.id.outButton);

        profileQuick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Intent intent = new Intent(BottomActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });

        buttonOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(BottomActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
                Toast.makeText(BottomActivity.this, "Logout Successful", Toast.LENGTH_SHORT).show();

                binding.quickAccess.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        showBottomDialog();
                    }
                });
            }
        });

        attQuick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Intent intent = new Intent(BottomActivity.this, NFC_Att_Activity.class);
                startActivity(intent);
            }
        });

        webQuick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Toast.makeText(BottomActivity.this, "Go TO Web Portal", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com")));
            }
        });
        if (!isFinishing()) {
            // show the dialog
            dialog.show();
            dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
            dialog.getWindow().setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL);
        }
    }
}
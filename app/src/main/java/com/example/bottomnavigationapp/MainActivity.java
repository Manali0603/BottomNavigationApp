package com.example.bottomnavigationapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView btm_nav_view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btm_nav_view = findViewById(R.id.btm_nav_view);


        btm_nav_view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();

                if (id == R.id.nav_home) {

                    loadFragment(new AFragment(), false);

                } else if (id == R.id.nav_search) {
                    loadFragment(new BFragment(), false);

                } else if (id == R.id.nav_utilities) {
                    loadFragment(new CFragment(), false);

                } else if (id == R.id.nav_contact) {
                    loadFragment(new DFragment(), false);

                } else {//profile
                    loadFragment(new EFragment(), false);
                }

                //to show which icon is selected
                return true;
            }
        });

        //add method used for profile and replace used for others
        btm_nav_view.setSelectedItemId(R.id.nav_profile);
    }

    public void loadFragment(Fragment fragment, boolean flag) {
        //for the fragment to load in the frame layout: below 4 steps
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        //replace used for the flag=false
//        if (flag)
//            ft.add(R.id.container, fragment);
//        else
            ft.replace(R.id.container, fragment);

        ft.commit();

    }
}
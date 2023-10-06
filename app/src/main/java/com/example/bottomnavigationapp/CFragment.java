package com.example.bottomnavigationapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.example.bottomnavigationapp.databinding.ActivityMainBinding;


public class CFragment extends Fragment {
    ActivityMainBinding activityMainBinding;

    public CFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        activityMainBinding=ActivityMainBinding.inflate(getLayoutInflater());

        RelativeLayout fragment= activityMainBinding.getRoot();


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_c, container, false);




    }
}
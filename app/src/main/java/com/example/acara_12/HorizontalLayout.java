package com.example.acara_12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class HorizontalLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horizontal_layout);
        getSupportActionBar().setTitle("Horizontal Layout");
    }
}
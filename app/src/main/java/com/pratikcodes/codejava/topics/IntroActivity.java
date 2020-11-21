package com.pratikcodes.codejava.topics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.pratikcodes.codejava.R;

import java.util.Objects;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Introduction");




    }
}
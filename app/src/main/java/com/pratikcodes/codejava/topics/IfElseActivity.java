package com.pratikcodes.codejava.topics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import com.pratikcodes.codejava.R;

public class IfElseActivity extends AppCompatActivity {
    Toolbar tool;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_if_else);
        tool = findViewById(R.id.iftool);
        setSupportActionBar(tool);

    }
}
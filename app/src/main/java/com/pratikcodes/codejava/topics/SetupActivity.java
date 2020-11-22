package com.pratikcodes.codejava.topics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import com.pratikcodes.codejava.R;

public class SetupActivity extends AppCompatActivity {

    Toolbar tool;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup);
        tool = findViewById(R.id.toolbar3);
        setSupportActionBar(tool);
    }
}
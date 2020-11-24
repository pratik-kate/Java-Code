package com.pratikcodes.codejava.topics;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.pratikcodes.codejava.R;

public class IOActivity extends AppCompatActivity {

    BottomNavigationView nav;
    Toolbar tool;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i_o);
        nav = findViewById(R.id.ionav);
        tool = findViewById(R.id.iotool);
        setSupportActionBar(tool);

        nav.setOnNavigationItemSelectedListener(listner);


    }

    BottomNavigationView.OnNavigationItemSelectedListener listner = item -> {
        Fragment selected =null;
        switch (item.getItemId())
        {
            case R.id.cmd:
                break;
            case R.id.buffered:
                break;
            case R.id.scanner:
                break;

        }
        getSupportFragmentManager().beginTransaction().replace(R.id.ioscreen,selected).commit();


        return true;
    };
}
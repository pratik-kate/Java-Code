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
import com.pratikcodes.codejava.fragments.BufferedFragment;
import com.pratikcodes.codejava.fragments.CmdFragment;
import com.pratikcodes.codejava.fragments.ScannerFragment;

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

        CmdFragment fragment = new CmdFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.ioscreen,fragment).commit();

        nav.setOnNavigationItemSelectedListener(listner);


    }

    BottomNavigationView.OnNavigationItemSelectedListener listner = item -> {
        Fragment selected =null;
        switch (item.getItemId())
        {
            case R.id.cmd:
                selected = new CmdFragment();
                break;
            case R.id.buffered:
                selected = new BufferedFragment();
                break;
            case R.id.scanner:
                selected = new ScannerFragment();
                break;

        }
        getSupportFragmentManager().beginTransaction().replace(R.id.ioscreen,selected).commit();


        return true;
    };
}
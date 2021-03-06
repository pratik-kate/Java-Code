package com.pratikcodes.codejava.topics;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.pratikcodes.codejava.R;
import com.pratikcodes.codejava.fragments.AboutFragment;
import com.pratikcodes.codejava.fragments.DoFragment;
import com.pratikcodes.codejava.fragments.ForFragment;
import com.pratikcodes.codejava.fragments.QuizFragment;
import com.pratikcodes.codejava.fragments.ShareFragment;
import com.pratikcodes.codejava.fragments.WhileFragment;

public class LoopActivity extends AppCompatActivity {

    Toolbar tool;
    BottomNavigationView nav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loop);

        tool = findViewById(R.id.looptool);
        nav = findViewById(R.id.loopnav);
        WhileFragment fragment = new WhileFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.loopscreen,fragment).commit();

        nav.setOnNavigationItemSelectedListener(listner);
    }

    BottomNavigationView.OnNavigationItemSelectedListener listner = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selected = null;
            switch (item.getItemId())
            {
                case R.id.idwhile:
                    selected = new WhileFragment();
                    break;
                case R.id.iddo:
                    selected = new DoFragment();
                    break;
                case R.id.idfor:
                    selected = new ForFragment();
                    break;

            }
            getSupportFragmentManager().beginTransaction().replace(R.id.loopscreen,selected).commit();
            return true;
        }
    };
}
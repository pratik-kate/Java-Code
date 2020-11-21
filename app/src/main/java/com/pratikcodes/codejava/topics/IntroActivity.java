package com.pratikcodes.codejava.topics;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.app.ActionBar;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.LinearLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.pratikcodes.codejava.R;
import com.pratikcodes.codejava.fragments.AboutFragment;
import com.pratikcodes.codejava.fragments.FeaturesFragment;
import com.pratikcodes.codejava.fragments.HistoryFragment;
import com.pratikcodes.codejava.fragments.JvmFragment;
import com.pratikcodes.codejava.fragments.LearnFragment;
import com.pratikcodes.codejava.fragments.QuizFragment;
import com.pratikcodes.codejava.fragments.ShareFragment;

import java.util.Objects;

public class IntroActivity extends AppCompatActivity {

    BottomNavigationView nav;
    Toolbar tool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        nav = findViewById(R.id.intronav);
        tool = findViewById(R.id.toolbar);
        setSupportActionBar(tool);
        //setting default screen for introduction fragment
        HistoryFragment home = new HistoryFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.introscreen,home).commit();

        nav.setOnNavigationItemSelectedListener(navListner);

    }

    private final BottomNavigationView.OnNavigationItemSelectedListener navListner = new
            BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selected = null;

                    switch (item.getItemId())
                    {
                        case R.id.history:
                            selected = new HistoryFragment();
                            break;
                        case R.id.features:
                            selected = new FeaturesFragment();
                            break;
                        case R.id.jvm:
                            selected = new JvmFragment();
                            break;

                    }
                        getSupportFragmentManager().beginTransaction().replace(R.id.introscreen,selected).commit();
                    return true;
                }
            };
}
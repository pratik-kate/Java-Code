package com.pratikcodes.codejava;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.pratikcodes.codejava.fragments.AboutFragment;
import com.pratikcodes.codejava.fragments.LearnFragment;
import com.pratikcodes.codejava.fragments.QuizFragment;
import com.pratikcodes.codejava.fragments.ShareFragment;

import java.io.File;

public class MainActivity extends AppCompatActivity{

    BottomNavigationView nav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nav = findViewById(R.id.navigation);

        nav.setOnNavigationItemSelectedListener(navListner);

        getSupportFragmentManager().beginTransaction().replace(R.id.screen,new LearnFragment()).commit();

    }

        private BottomNavigationView.OnNavigationItemSelectedListener navListner = new
                BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        Fragment selected = null;

                        switch (item.getItemId())
                        {
                            case R.id.learn:
                                    selected = new LearnFragment();
                                break;
                            case R.id.quiz:
                                selected = new QuizFragment();
                                break;
                            case R.id.info:
                                selected = new AboutFragment();
                                break;
                            case R.id.share:
                                selected = new ShareFragment();
                                break;


                        }
                        getSupportFragmentManager().beginTransaction().replace(R.id.screen,selected).commit();
                        return true;
                    }
                };


}
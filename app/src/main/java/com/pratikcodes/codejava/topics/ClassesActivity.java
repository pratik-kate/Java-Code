package com.pratikcodes.codejava.topics;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.pratikcodes.codejava.R;
import com.pratikcodes.codejava.fragments.ClassesFragment;
import com.pratikcodes.codejava.fragments.ObjectFragment;
import com.pratikcodes.codejava.fragments.WrapperFragment;

public class ClassesActivity extends AppCompatActivity {

    Toolbar tool;
    BottomNavigationView nav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classes);

        tool = findViewById(R.id.classtool);
        nav = findViewById(R.id.classnav);

        ClassesFragment fragment = new ClassesFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.classscreen,fragment).commit();
        nav.setOnNavigationItemSelectedListener(listener);

    }

    BottomNavigationView.OnNavigationItemSelectedListener listener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selected = null;
            switch (item.getItemId())
            {
                case R.id.idclass:
                    selected = new ClassesFragment();
                    break;
                case R.id.idobject:
                    selected = new ObjectFragment();
                    break;
                case R.id.idwrapper:
                    selected = new WrapperFragment();
                    break;
            }

            getSupportFragmentManager().beginTransaction().replace(R.id.classscreen,selected).commit();

            return true;
        }
    };
}
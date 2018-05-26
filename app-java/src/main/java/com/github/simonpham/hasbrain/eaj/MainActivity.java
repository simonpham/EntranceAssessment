package com.github.simonpham.hasbrain.eaj;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.nav_explorer:
                    toolbar.setTitle(R.string.title_explore);
                    return true;
                case R.id.nav_saved:
                    toolbar.setTitle(R.string.title_saved);
                    return true;
                case R.id.nav_me:
                    toolbar.setTitle(R.string.title_me);
                    return true;
                case R.id.nav_quest:
                    toolbar.setTitle(R.string.title_quest);
                    return true;
                case R.id.nav_inbox:
                    toolbar.setTitle(R.string.title_inbox);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindView();
        setSupportActionBar(toolbar);

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    private void bindView() {
        toolbar = findViewById(R.id.toolbar);
    }

}

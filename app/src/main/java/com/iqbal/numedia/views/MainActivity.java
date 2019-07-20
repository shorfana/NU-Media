package com.iqbal.numedia.views;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

import com.iqbal.numedia.R;
import com.iqbal.numedia.views.explore.FragmentExplore;
import com.iqbal.numedia.views.home.FragmentHome;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(this);
        loadFragment(new FragmentHome());
    }

    void loadFragment(Fragment fragment){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.container_frame,fragment);
        ft.commit();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        switch (menuItem.getItemId()){
            case R.id.navigation_home:
                loadFragment(new FragmentHome());
                return true;
            case R.id.navigation_explore:
                loadFragment(new FragmentExplore());
                return true;
        }

        return false;
    }
}

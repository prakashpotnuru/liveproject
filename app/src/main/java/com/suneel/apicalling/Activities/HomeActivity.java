package com.suneel.apicalling.Activities;

import android.os.Bundle;
import android.view.MenuItem;
//practice
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.suneel.apicalling.R;
import com.suneel.apicalling.fragments.Dashboard;
import com.suneel.apicalling.fragments.profile;
import com.suneel.apicalling.fragments.users;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class HomeActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bottomNavigationView= findViewById(R.id.bottom_nav);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        loadFragment(new Dashboard());

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment =null;

        switch (item.getItemId()){
            case R.id.dashboard:
                fragment=new Dashboard();
                break;
            case R.id.users:
                fragment= new users();
               break;
            case R.id.profile:
                fragment=new profile();
                break;
        }
        if(fragment!=null) {
            loadFragment(fragment);
        }
        return true;
    }
    void loadFragment(Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(R.id.relativelayout,fragment).commit();
    }
}

package com.error41.botton_navigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{


    BottomNavigationView bottomNavigationView;
    FirstFragment firstFragment= new FirstFragment();
    SecondFragment secondFragment=new SecondFragment();
    ThirdFragment thirdFragment = new ThirdFragment ();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView=findViewById(R.id.bottonNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(this);

        bottomNavigationView.setSelectedItemId(R.id.home);


    }



    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

           if (item.getItemId() ==R.id.profile)
           {


                   getSupportFragmentManager().beginTransaction().replace(R.id.flFragment,firstFragment).commit();


           } else if (item.getItemId() ==R.id.home) {

               getSupportFragmentManager().beginTransaction().replace(R.id.flFragment,secondFragment).commit();

           }else if (item.getItemId() ==R.id.setting) {

               getSupportFragmentManager().beginTransaction().replace(R.id.flFragment,thirdFragment).commit();

           }
        return  false;
    }
}
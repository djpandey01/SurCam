package com.surcam.dabz.surcam;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        //FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //here
                startActivity(new Intent(MainActivity.this, About.class));
                // or:
                startActivity(new Intent(v.getContext(), About.class));
            }

        });


        FirstFragment firstFragment = new FirstFragment();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction()
                .replace(R.id.firstLayout, firstFragment, firstFragment.getTag())
                .commit();

        SecondFragment secondFragment = new SecondFragment();
        manager.beginTransaction()
                .replace(R.id.secondLayout, secondFragment, secondFragment.getTag())
                .commit();
    }




}

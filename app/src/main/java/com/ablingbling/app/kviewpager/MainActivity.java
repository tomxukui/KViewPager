package com.ablingbling.app.kviewpager;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.ablingbling.library.kviewpager.KViewPager;

public class MainActivity extends AppCompatActivity {

    private KViewPager viewPager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(new MainPagerAdapter(this));
    }

}

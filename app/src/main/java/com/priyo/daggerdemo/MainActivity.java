package com.priyo.daggerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.priyo.daggerdemo.demo.DaggerLaptopComponent;
import com.priyo.daggerdemo.demo.LaptopComponent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LaptopComponent l = DaggerLaptopComponent.create();
        l.getlaptop().startLaptop();
    }
}

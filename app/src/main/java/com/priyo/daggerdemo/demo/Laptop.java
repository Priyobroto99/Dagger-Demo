package com.priyo.daggerdemo.demo;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;


@Singleton
public class Laptop {

    private Battery battery;
    private MotherBoard motherboard;
    private SimCard Simcard;
    private OperatingSystem os;

    @Inject
    public Laptop(Battery battery, MotherBoard motherboard, SimCard simcard, OperatingSystem os) {
        this.battery = battery;
        this.motherboard = motherboard;
        Simcard = simcard;
        this.os = os;
    }



    public void startLaptop(){
    	Log.i("Priyo","Started Laptop");
	}
}

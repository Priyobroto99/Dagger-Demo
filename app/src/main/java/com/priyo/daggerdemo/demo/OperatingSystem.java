package com.priyo.daggerdemo.demo;

import android.util.Log;

import dagger.Module;
import dagger.Provides;

@Module
public class OperatingSystem {

	Windows w;
	MacOs m;


	private OperatingSystem(Windows windows,MacOs mac) {
		this.w = windows;
		this.m = mac;

	}

	@Provides
	public static OperatingSystem getOperatingSystemInstance(Windows windows,MacOs mac){
		Log.i("Priyo","Started OS");
		return new OperatingSystem(windows,mac);
	}

}

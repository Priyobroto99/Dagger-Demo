package com.priyo.daggerdemo.demo;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = OperatingSystem.class)
public interface LaptopComponent {

	
	public Laptop getlaptop();
}

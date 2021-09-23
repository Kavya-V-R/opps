package com.xworkz.oops;

public class Fan {
	String brand;
	String colour;
	String Type;
	int price;
	int powerConsumption;
	int Bladesize;
	int motorSpeed;

	public void switchOn() {
		System.out.println("fan switched on");
	}

	public void varySpeed() {
		System.out.println("fan speed varied");
	}

	public void switchOff() {
		System.out.println("fan switched off");
	}
}

package com.xworkz.oops;

public class SewingMachine {
	String brand;
	String colour;
	String material;
	int price;
	double dimensions;
	int itemWeight;
	boolean motorSupport;

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

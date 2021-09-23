package com.xworkz.oops;

public class SmartCoffeeMaker {
	String brand;
	String colour;
	String material;
	int price;
	int capacity;
	int weight;
	int wattage;
	int voltage;

	public void switchOn() {
		System.out.println("fan switched on");
	}

	public void makeCoffee() {
		System.out.println("coffee made");
	}

	public void switchOff() {
		System.out.println("fan switched off");
	}
}

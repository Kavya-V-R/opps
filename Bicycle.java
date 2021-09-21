package com.xworkz.oops;

public class Bicycle {
	String colour;
	String brand;
	String type;
	int price;
	int wheelSize;
	int nuOfWheels;
	int Breaks;

	public void startCycling() {
		System.out.println("cycling started");
	}

	public void applyBreak() {
		System.out.println("break applied");
	}

	public void dobell() {
		System.out.println("belled");
	}

	public static void main(String[] args) {
		Bicycle Hero = new Bicycle();
		Hero.brand = "Hero";
		Hero.Breaks = 2;
		Hero.colour = "pink";
		Hero.nuOfWheels = 2;
		Hero.price = 9000;
		Hero.type = "kids";
		Hero.wheelSize = 20;
		Hero.startCycling();
		Hero.applyBreak();
		Hero.dobell();
		System.out.println(Hero.brand);
		System.out.println(Hero.Breaks);
		System.out.println(Hero.colour);
		System.out.println(Hero.nuOfWheels);
		System.out.println(Hero.price);
		System.out.println(Hero.type);
		System.out.println(Hero.wheelSize);
	}

}

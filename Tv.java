package com.xworkz.oops;

public class Tv {
	String brand;
	String power;
	String colour;
	int voltage;
	int ampere;
	int frequency;
	int manufactureYear;
	int price;
	int inches;

	public void switchOn() {
		System.out.println("Tv switched on");
	}

	public void changeChannel() {
		System.out.println("channel changed");
	}

	public void playFm() {
		System.out.println("fm played");
	}

	public void switchOff() {
		System.out.println("tv switched off");
	}

	public static void main(String[] args) {
		Tv LG = new Tv();
		LG.brand = "LG";
		LG.ampere = 1;
		LG.frequency = 50;
		LG.colour = "black";
		LG.manufactureYear = 2015;
		LG.inches = 32;
		LG.power = "AC";
		LG.price = 25000;
		LG.voltage = 215;
		LG.switchOn();
		LG.changeChannel();
		LG.playFm();
		LG.switchOff();
		System.out.println(LG.brand);
		System.out.println(LG.ampere);
		System.out.println(LG.frequency);
		System.out.println(LG.colour);
		System.out.println(LG.manufactureYear);
		System.out.println(LG.inches);
		System.out.println(LG.power);
		System.out.println(LG.price);

	}
}

package com.xworkz.oops;

public class WashingMachine {
	double energyConsumption;
	int warranty;
	String brand;
	String colour;
	int manufactureYear;
	String loadType;
	int loadCapacity;
	int price;

	public void openDoor() {
		System.out.println("the door is opened");
	}

	public void washingPowder() {
		System.out.println("washing powder filled");
	}

	public void cloth() {
		System.out.println("cloths filled");
	}

	public void closedoor() {
		System.out.println("the door is closed");
	}

	public static void main(String[] args) {
		WashingMachine LG = new WashingMachine();
		LG.brand = "LG";
		LG.energyConsumption = 0.024;
		LG.warranty = 2;
		LG.colour = "silver";
		LG.manufactureYear = 2021;
		LG.loadType = "frontLoad";
		LG.loadCapacity = 9;
		LG.price = 45000;
		LG.openDoor();
		LG.washingPowder();
		LG.cloth();
		LG.closedoor();
		System.out.println(LG.brand);
		System.out.println(LG.energyConsumption);
		System.out.println(LG.warranty);
		System.out.println(LG.colour);
		System.out.println(LG.manufactureYear);
		System.out.println(LG.loadType);
		System.out.println(LG.loadCapacity);
		System.out.println(LG.price);

	}

}

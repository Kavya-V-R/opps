package com.xworkz.oops;

public class Refrigerator {
	int energyConsumption;
	int warranty;
	String brand;
	String colour;
	int manufactureYear;
	int grossVolume;
	int storageVolume;
	int price;

	public void openDoor() {
		System.out.println("Door is opened");
	}

	public void iceCube() {
		System.out.println("Icecube made");
	}

	public void vegetables() {
		System.out.println("vegetables are stored");
	}

	public void closeDoor() {
		System.out.println("Door is closed");
	}

	public static void main(String[] args) {
		Refrigerator LG = new Refrigerator();
		LG.brand = "LG";
		LG.energyConsumption = 258;
		LG.warranty = 10;
		LG.colour = "red";
		LG.manufactureYear = 2021;
		LG.grossVolume = 308;
		LG.storageVolume = 280;
		LG.price = 30000;
		LG.openDoor();
		LG.iceCube();
		LG.vegetables();
		LG.closeDoor();
		System.out.println(LG.brand);
		System.out.println(LG.energyConsumption);
		System.out.println(LG.warranty);
		System.out.println(LG.colour);
		System.out.println(LG.manufactureYear);
		System.out.println(LG.grossVolume);
		System.out.println(LG.storageVolume);
		System.out.println(LG.price);

	}
}
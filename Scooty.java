package com.xworkz.oops;

public class Scooty {
	String brand;
	String colour;
	String fuelType;
	int price;
	double fuelCapacity;
	int Cylinder;
	double maxPower;

	public void start() {
		System.out.println("scooty get started");
	}

	public void accelerate() {
		System.out.println("accelerated");
	}

	public void horn() {
		System.out.println("press horn");
	}

	public static void main(String[] args) {
		Scooty TVS = new Scooty();
		TVS.brand = "TVS";
		TVS.colour = "red";
		TVS.Cylinder = 1;
		TVS.fuelCapacity = 4.2;
		TVS.fuelType = "petrol";
		TVS.maxPower = 5.4;
		TVS.price = 70000;
		TVS.start();
		TVS.horn();
		TVS.accelerate();
		System.out.println(TVS.brand);
		System.out.println(TVS.colour);
		System.out.println(TVS.Cylinder);
		System.out.println(TVS.fuelCapacity);
		System.out.println(TVS.fuelType);
		System.out.println(TVS.maxPower);
		System.out.println(TVS.price);

	}
}

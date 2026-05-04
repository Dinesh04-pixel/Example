package com.program;

public class Car {
	// Declaring private attributes
	private String model;
	private int carNumber;

//initializing attributes

//Car(String model, int carNumber)
//{
//	this.model = model;
//	this.carNumber = carNumber;
//}

//print details

	public void printDetails(String model, int carNumber) {
		this.model = model;
		this.carNumber = carNumber;
		System.out.print("Car Details: ");
		System.out.println(this.model+", "+this.carNumber);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create car objects
		Car c = new Car();
		c.printDetails("Toyota", 100);
		c.printDetails("Tata", 200);
		
	}

}

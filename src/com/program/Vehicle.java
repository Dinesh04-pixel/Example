package com.program;

public class Vehicle {
	String color;

	Vehicle(String c) {
		color = c;
	}

	void displayColor() {
		System.out.println("Vehicle color: " + color);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v = new Vehicle("Red");
		v.displayColor();
	}

}

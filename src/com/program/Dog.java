package com.program;

public class Dog extends Animal {
	public void sound() {
		super.sound();
		System.out.println("Dog barks");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Dog();
		a.sound();
	}

}

package com.program;

public class Dog1 extends Animal1 {
	public void sound() {
		super.sound();
		System.out.println("Dog barks");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog1 d = new Dog1();
		d.sound();
		d.name();
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("This is an abstract method");
	}

}

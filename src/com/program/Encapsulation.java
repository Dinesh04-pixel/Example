package com.program;

public class Encapsulation {
	private int age;

	public void setAge(int newage) {
		age = newage;
	}

	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation E = new Encapsulation();
		E.setAge(25);
		System.out.println(E.getAge());
	}

}

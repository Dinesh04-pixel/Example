package com.program1;

public class ThrowExample {
	public static void validateAge(int age) {
		if (age < 18) {
			throw new ArithmeticException("Age must be 18 or older");
		} else {
			System.out.println("Access granted. Age: " + age);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		validateAge(20);
		try {
			validateAge(15);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Caught Exception: " + e.getMessage());
		}
	}

}

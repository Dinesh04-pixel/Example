package com.program1;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 10, b = 0;
			int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Error: Division by Zero!!!");
		} finally {
			System.out.println("Finally block executed");
		}
	}

}

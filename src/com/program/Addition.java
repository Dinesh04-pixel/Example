package com.program;

public class Addition {
	public int add(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition a = new Addition();
		int result = a.add(10, 20);
		System.out.println("Sum: "+result);
	}

}

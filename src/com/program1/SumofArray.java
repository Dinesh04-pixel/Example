package com.program1;

public class SumofArray {
	public static void sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.print("Sum of array values: " + sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 15, 5, 8, 13 };
		sum(arr);
	}

}

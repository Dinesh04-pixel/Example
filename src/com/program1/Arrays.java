package com.program1;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] numbers = new int[5];
//		numbers[0] = 10;
//		numbers[1] = 5;
//		numbers[2] = 17;
//		numbers[3] = 25;
//		numbers[4] = 35;
//		System.out.println("First Element: "+numbers[0]);
//		System.out.println("Third Element: "+numbers[2]);
//		System.out.println(numbers.length);
//		int[] arr = {10, 20, 30, 40, 50};
//		int n = arr.length;
//		for (int i=0; i<n; i++)
//		{
//			System.out.println(arr[i]);
//		}
		int[] arr = new int[5];
		arr[0] = 5;
		arr[1] = 15;
		arr[2] = 25;
		arr[3] = 35;
		arr[4] = 45;
		for (int i=0; i<arr.length; i++)
		{
			System.out.println("Element at index "+ i + ": "+arr[i]);
		}
	}
}

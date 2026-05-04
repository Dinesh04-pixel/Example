package com.program1;

import java.security.PublicKey;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// using Arrays.sort()
		/*
		 * int[] numbers = new int[5]; Scanner sc = new Scanner(System.in);
		 * System.out.println("Enter the 5 numbers: "); for (int i=0; i<5; i++) {
		 * numbers[i] = sc.nextInt(); } Arrays.sort(numbers);
		 * System.out.print("Sorted numbers: "); for (int num : numbers) {
		 * System.out.print(num +" "); } sc.close();
		 */

		// without using Arrays.sort() - Bubble sort

		int[] arr = { 4, 1, 6, 0, 2 };
		for (int i = 0; i < 4; i++) {
			for (int j = i + 1; j < 5; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print("Sorted numbers: ");
		for (int num : arr) {
			System.out.print(num +" ");
		}
	}

}

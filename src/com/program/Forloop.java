package com.program;

import java.util.Scanner;

public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		System.out.println("The numbers from 1 to " + n + ":");
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}
		sc.close();		
	}

}

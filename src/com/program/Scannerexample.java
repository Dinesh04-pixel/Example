package com.program;

import java.util.Scanner;

public class Scannerexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.next();
		System.out.println("Hello "+name);
		System.out.println("Enter your mobile number: ");
		int mnumber = sc.nextInt();
		System.out.println("mobile number: "+mnumber);
		System.out.println("Enter your dept: ");
		String dept = sc.next();
		System.out.println("Entered dept: "+dept);
	}

}

package com.program;

import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		do
		{
			System.out.println("Enter the positive number: ");
			num = sc.nextInt();
			if(num>0)
			{
				System.out.println("Yot entered: "+num);
			}
		}while(num!=0);
		System.out.println("Program exited");
		sc.close();
	}

}

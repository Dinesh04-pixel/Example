package com.program1;

import java.util.Scanner;

public class TwoDarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows: ");
		int rows = sc.nextInt();
		System.out.println("Enter columns: ");
		int cols = sc.nextInt();
		int[][] arr = new int[rows][cols];
		System.out.println("Enter the elements: ");
		for(int i=0; i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("The 2D array is: ");
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
		sc.close();
		
		}

}

package com.program1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThrowsExample {
public static void readFile() throws FileNotFoundException
{
Scanner sc = new Scanner(new File("test.txt"));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	readFile();
} catch (FileNotFoundException e) {
	// TODO: handle exception
	System.out.println("File not found!");
}
	}

}

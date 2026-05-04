package com.program;

public class Stringmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Welcome";
		String s2 = "   Chennai   ";
		String s3 = "Welcome to india";
		String s4 = "Apple";
		String s5 = "Apple";
		int n = 50;
		String s = String.valueOf(n);
		String[] arr = s3.split(" ");
		for(String a : arr)
		{
			System.out.println(a);
		}
		System.out.println(s1.length());
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s2.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.startsWith("H"));
		System.out.println(s2.endsWith("i"));
		System.out.println(s1.contains("n"));
		System.out.println(s1.indexOf("A"));
		System.out.println(s2.lastIndexOf("n"));
		System.out.println(s1.charAt(5));
		System.out.println(s1.replace('H', 'i'));
		System.out.println(s2.substring(4));
		System.out.println(s2.substring(4, 6));
		System.out.println(s1.isEmpty());
		System.out.println(s2.trim());
		System.out.println(s1.concat(s2));
		System.out.println(s);
		System.out.println(s4.compareTo(s5));
	}

}

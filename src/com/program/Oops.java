package com.program;

public class Oops {
	String s = "Hello"; // class variable
	static int a = 10; //static variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Oops o = new Oops();
		System.out.println(o.s);
		System.out.println(a);
		System.out.println(Oops.a);
		System.out.println(o.a);
	}

}

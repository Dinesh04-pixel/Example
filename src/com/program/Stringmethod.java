package com.program;

public class Stringmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		String s2 = "Hello";
		s2 = s2.concat(" World");
		System.out.println(s2);
		System.out.println(System.identityHashCode(s2));
		s1 = s1.concat(" World");
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));
	}

}

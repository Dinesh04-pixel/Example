package com.program;

public class Stringbufferexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StringBuilder sb1 = new StringBuilder("Welcome");
//		StringBuilder sb2 = new StringBuilder("Welcome");
//		sb2.append(" India");
//		System.out.println(sb1);
//		System.out.println(System.identityHashCode(sb1));
//		System.out.println(sb2);
//		System.out.println(System.identityHashCode(sb2));
//
//		StringBuilder sb3 = new StringBuilder("Hello");
//		StringBuilder sb4 = sb3;
//		sb4.append(" World");
//		System.out.println(sb3);
//		System.out.println(System.identityHashCode(sb3));
//		System.out.println(sb4);
//		System.out.println(System.identityHashCode(sb4));
//
//		String s1 = "Java";
//		String s2 = "Java";
//		System.out.println(s1 == s2);
//		System.out.println(s1.equals(s2));
//
//		String s3 = new String("Java");
//		String s4 = new String("Java");
//		System.out.println(s3 == s4);
//		System.out.println(s3.equals(s4));

//		String s5 = new String("Java");
//		String s6 = s5.intern();
//		System.out.println(s5 == s6);
//		System.out.println(s5.equals(s6));
		
		StringBuffer sb1 = new StringBuffer("Hello");
		StringBuffer sb2 = new StringBuffer("Hello");
		boolean contentEqual = sb1.equals(sb2);
		System.out.println(contentEqual);
		boolean contentEqual1 = sb1.toString().equals(sb2.toString());
		System.out.println(contentEqual1);
		boolean contentEqual2 = sb1.toString().contentEquals(sb2);
		System.out.println(contentEqual2);
		}

}

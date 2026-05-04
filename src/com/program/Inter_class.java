package com.program;

public class Inter_class implements Inter1, Inter2, Inter3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inter_class aClass = new Inter_class();
		aClass.method_1();
		aClass.method_2();
		aClass.method_3();
	}

	@Override
	public void method_3() {
		// TODO Auto-generated method stub
		System.out.println("This is method3");
	}

	@Override
	public void method_2() {
		// TODO Auto-generated method stub
		System.out.println("This is method2");
	}

	@Override
	public void method_1() {
		// TODO Auto-generated method stub
		System.out.println("This is method1");
	}

}

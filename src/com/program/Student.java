package com.program;

public class Student {
	int id;
	static String college = "ABC College";

	public void display() {
		System.out.println(id + " " + college);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.id = 101;
		Student s2 = new Student();
		s2.id = 102;
		s1.display();
		s2.display();

	}

}

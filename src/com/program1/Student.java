package com.program1;

public class Student {
	int rollno;
	String name;

	Student(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

	public void display() {
		System.out.println("Rollno: " + rollno + ", Name: " + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] students = new Student[3];
		students[0] = new Student(10, "Alice");
		students[1] = new Student(12, "Bob");
		students[2] = new Student(25, "James");
		for (int i=0; i<students.length; i++)
		{
			students[i].display();
		}
	}

}

package com.program;

public class Thiskeyword {
	int id;
	String name;

	public void display(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println(id + " " +name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thiskeyword t = new Thiskeyword();
		t.display(101, "Dinesh");
	}

}

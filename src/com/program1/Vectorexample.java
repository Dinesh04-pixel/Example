package com.program1;

import java.util.Vector;

public class Vectorexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> vector = new Vector<>();
		vector.add(10);
		vector.add(30);
		vector.add(50);
		
		vector.add(1, 15);
		System.out.println("vector: " + vector);
		System.out.println("Element at 2nd index: " + vector.get(2));
		vector.remove(1);
		System.out.println("after remove: " + vector);
		System.out.println("size: " + vector.size());
		System.out.println(vector.elementAt(0));
		
		Vector<Integer> v = new Vector<>(3);

		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);

		System.out.println(v.capacity()); // doubles when full

	}

}

package com.program1;

import java.util.LinkedList;

public class LinkedListexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<>();
		// adding elements
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		//add at beginning and end
		list.addFirst(5);
		list.addLast(40);
		
		//display list
		System.out.println(list);
		
		//access elements
		System.out.println("First: " + list.getFirst());
		System.out.println("Last: " + list.getLast());
		
		//remove elements
		list.removeFirst();
		list.removeLast();
		
		System.out.println("After removal: " + list);
	}

}

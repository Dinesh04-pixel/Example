package com.program1;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create ArrayList of Strings
		ArrayList<String> fruits = new ArrayList<>();

		// Add elements
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Apple"); // Duplicate allowed

		// Print ArrayList
		System.out.println("Fruits: " + fruits);

		// Access element by index
		System.out.println("First fruit: " + fruits.get(0));

		// Modify element
		fruits.set(1, "Mango");
		System.out.println("After modification: " + fruits);

		// Remove element
		fruits.remove("Apple");
		System.out.println("After removing: " + fruits);

		// Iterate using for-each loop
		System.out.println("Iterating fruits:");
		for (String fruit : fruits) {
			System.out.println(fruit);
		}

		// Check size
		System.out.println("Number of fruits: " + fruits.size());
		
		// Check if empty
		System.out.println("Is ArrayList empty? " + fruits.isEmpty());
		
		// Check ArrayList contains an element
		System.out.println("Contains Orange? " + fruits.contains("Orange"));
		System.out.println("Contains Mango? " + fruits.contains("Mango"));
		
		// Check Case-sensitive
		System.out.println("Contains apple? " + fruits.contains("apple"));
		
		//Null example
		System.out.println("Contains null? " + fruits.contains(null));
		
		// Check index of an element in ArrayList
		System.out.println("Index of Orange: " +fruits.indexOf("Orange"));
		System.out.println("Index of PineApple: " +fruits.indexOf("PineApple"));
		
		// RemoveAll method
		ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange", "Mango"));
		ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Banana", "Mango"));
		list1.removeAll(list2);
		System.out.println("After removeAll: " + list1);
		
		// RetainAll method
		list1.retainAll(list2);
		System.out.println("After retainAll: " + list1);
		
		// addAll method
		ArrayList<String> list3 = new ArrayList<>(Arrays.asList("Apple", "Orange", "Banana"));
		ArrayList<String> list4 = new ArrayList<>(Arrays.asList("Mango", "Pineapple"));
		list3.addAll(list4);
		System.out.println("After adding: " + list3);
	
	}

}

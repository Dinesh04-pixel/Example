package com.program1;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// HashMap (No order)
		Map<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "Java");
		hashMap.put(3, "C++");
		hashMap.put(2, "Python");
		System.out.println("HashMap: " + hashMap);
		System.out.println("Value for key 2: " + hashMap.get(2));
		System.out.println("contains key 1?:" + hashMap.containsKey(1));
		System.out.println("contains value 'Nodejs':" + hashMap.containsValue("Nodejs"));
		System.out.println("Size of map: " + hashMap.size());
		System.out.println("Is map empty?:" + hashMap.isEmpty());
		hashMap.remove(3);
		System.out.println("After remove key 3: " + hashMap);
		for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
		for (Integer key : hashMap.keySet()) {
			System.out.println(key + "->" + hashMap.get(key));
		}
		String s = "array";
		Map<Character, Integer> freq = new HashMap<>();
		for (char c : s.toCharArray()) {
			freq.put(c, freq.getOrDefault(c, 0) + 1);
		}
		System.out.println(freq);
	}

}

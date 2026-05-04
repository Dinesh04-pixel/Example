package com.program1;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new LinkedHashMap<>();
		map.put(2, "Banana");
		map.put(1, "Apple");
		map.put(3, "Orange");
		System.out.println(map);
		for(Integer key : map.keySet())
		{
			System.out.println(key + "->" + map.get(key));
		}
	}

}

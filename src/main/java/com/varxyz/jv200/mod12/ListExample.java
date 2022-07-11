package com.varxyz.jv200.mod12;

import java.util.*;

/**
 * Collection  <-(부모표시)  Set, List, Map  [넷 다 interface]
 * Set <- HashSet 
 * List <- ArrayList
 * Map <- HashMap
 * 
 * Set : 중복x 순서x
 * List : 중복o 순서o
 * Map : (key-value)쌍
 */

public class ListExample {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("one");
		list.add("one");
		list.add("second");
		list.add("3rd");
		list.add(new Integer(4));
		list.add(new Float(5.0F));
		list.add("second"); // duplicate, not added
		list.add(new Integer(4)); // duplicate, not added
		System.out.println(list);
	}
}
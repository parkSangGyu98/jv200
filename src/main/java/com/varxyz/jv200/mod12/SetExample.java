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

public class SetExample {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("one");
		set.add("one");
		set.add("second");
		set.add("3rd");
		set.add(new Integer(4));
		set.add(new Float(5.0F));
		set.add("second"); // duplicate, not added
		set.add(new Integer(4)); // duplicate, not added
		
		System.out.println(set);
	}
}
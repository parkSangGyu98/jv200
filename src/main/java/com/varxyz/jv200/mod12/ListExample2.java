package com.varxyz.jv200.mod12;

import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * for( 타입 변수 : 리스트) -> 리스트를 변수에 담아줌
 * ex) for(String x : list) { s.o.p(x) }
 * 
 *
 */

public class ListExample2{
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add(0 , "hello");
		list.add(1 , "java");
		list.add(2 , "python");
		
//		String total = list.get(1);
		
		System.out.println(list);
//		System.out.println(total);
		
		for( String total : list) {
			System.out.println("for문 리스트 출력: " + total);
		}
		
		
		
	}

}

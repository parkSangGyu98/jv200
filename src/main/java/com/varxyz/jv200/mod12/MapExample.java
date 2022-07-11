package com.varxyz.jv200.mod12;

import java.util.*;

public class MapExample {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(Integer.valueOf(1), "유비"); //map은 add가 아닌 put 사용
		map.put(2, "관우"); //auto boxing -> 2라고 써도 알아서 타입 변경해줌
		map.put(new Integer(3), "장비"); // 버전9 부터 안쓰는거 추천

//		System.out.println(map.get(2));
		
		Set<Integer> set = map.keySet(); //map의 키값 가져오기
		for( Integer integer : set ) {
			System.out.println("키 값 = " + integer + " , " + map.get(integer));
		}
	}
}

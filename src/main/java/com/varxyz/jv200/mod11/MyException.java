package com.varxyz.jv200.mod11;

import java.util.Iterator;
/**
 *  숫자하나 받아서 그 숫자의 범위만큼 소수 구하고
 *  그 숫자 곱을 최대공약수로 나타내기
 * @author 
 *
 */

public class MyException { 
	static int count;
	
	public static void minorityNumCheck(int input) {
		
	try {
		for (int i = 2; i <= input; i++) { 
			for (int j = 2; j <= i; j++) {
				if( i % j == 0) {
					count++;
				}
			}
			if(count == 1 && i == input) {
				System.out.println(input + " 는 소수입니다.");
			}
			else if (input == i) {
				throw new Exception();
			}
			count = 0;
		}
	} catch (Exception e) {
		if(input % 2 == 0) {
			System.out.println("2 x " + input/2 + " = " + input);
		}
		else {
			System.out.println("3 x " + input/3 + " = " + input);
		}
	}
	
	}
}

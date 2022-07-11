package com.varxyz.jv200.mod3;

public class Test { //구구단 만들기
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.print(j + "*" + i + "=" + j*i + "\t");
				if ( j == 9) {
					System.out.println();
				}
			}
		}
	}
}

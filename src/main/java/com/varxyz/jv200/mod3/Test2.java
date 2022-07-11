package com.varxyz.jv200.mod3;

public class Test2 { //1000까지의 숫자 중, 소수와 소수의 개수 구하기
	public static void main(String[] args) {
		int count = 0;
		int num = 0;
		for (int i = 2; i < 1000; i++) {
			for (int j = 2; j < i+1; j++) {
				if (i % j == 0) {
					count ++;
//					System.out.println("test" + i); // 4 같은 경우를 보면, 몫이 0이 되는 순간이 2번이나 있지만 밑에 count == 1로 지정해둬서 한번만 몫이 0이되는 숫자만 출력한다.
				}
			}
			if (count  == 1) { 
				System.out.println(i);
				num ++;
			}
			count = 0;
		}
		System.out.println("소수의 개수 : " + num);
	}
}

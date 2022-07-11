package com.varxyz.jv200.mod8;

public class Airplane implements Flyer,Vehicle { //상속은 extends를 사용하지만, 부모가 인터페이스인 경우엔 implements 사용
	
	
	public void fly() {
		System.out.println("비행기 : 날다"); 
	}

	
	public void takeOff() {
		System.out.println("비행기 : 이륙");
	}

	
	public void land() {
		System.out.println("비행기 : 착륙");
	}

	public void vehicle() {
		System.out.println("vehicle : 비행기");
	}
	
}

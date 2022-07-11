package com.varxyz.jv200.mod8;

public class Bird implements Flyer, Vehicle { 

	@Override
	public void fly() {
		System.out.println("새 : 날다"); 
	}

	@Override
	public void takeOff() {
		System.out.println("새 : 이륙");
	}

	@Override
	public void land() {
		System.out.println("새 : 착륙");
	}
	
	@Override
	public void vehicle() {
		System.out.println("vehicle : 나는 새얌");
	}
	
}
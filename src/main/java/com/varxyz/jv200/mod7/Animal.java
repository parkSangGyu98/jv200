package com.varxyz.jv200.mod7;

public abstract class Animal { //추상 클래스
	public String type; //포유류, 조류, 양서류, 파충류
	public boolean eatable;
	
	public abstract void makeSound(); //추상 메소드
	public abstract void setType(String type);
	public abstract void getType();
	
}
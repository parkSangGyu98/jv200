package com.varxyz.jv200.mod7;

public class Dog extends Animal { 
	//Dog 클래스는 추상 클래스를 상속받음 -> abstract 안해줘도 오류 안뜨는 이유는
	//부모클래스에 있는 메소드를 오버라이딩 해줬기때문
	
	@Override
	public void makeSound() {
		System.out.println("멍멍!");
	}

	@Override
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public void getType() {
		System.out.println("강아지는 " + type);
	}
	
}

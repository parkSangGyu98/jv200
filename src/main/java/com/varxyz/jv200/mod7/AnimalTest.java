package com.varxyz.jv200.mod7;

public class AnimalTest {

	public static void main(String[] args) {
//		Animal animal = new Animal(); //에러뜨는이유: 추상클래스는 객체생성이 불가능하다
		Animal animal = new Dog();
		Animal animal2 = new Cat();
		
		animal.makeSound();
		animal.setType("기여운 포유류");
		
		animal2.makeSound();
		animal2.setType("이쁜 포유류");
		
		animal.getType();
		animal2.getType();
	}

}
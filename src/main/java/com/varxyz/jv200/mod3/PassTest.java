package com.varxyz.jv200.mod3;

public class PassTest {
	public static void changeInt(int value) {
		value = 55;
	}
	
	public static void changeObjectRef(MyDate ref) {
		ref = new MyDate(1,1,2000); //객체 생성
		//객체 생성 시, parameter로 값을 받아주려면 생성자부터 선언하고 파라미터를 선언해줘야한다.
	}
	
	public static void changeObjectAttr(MyDate ref) {
		ref.setDay(4); //MyDate 내의 method
		ref.setMonth(4);
	}
	
	public static void main(String[] args) { //main class
		MyDate date = new MyDate(22, 7, 1964); //객체 생성
		int val = 11;
		
		changeInt(val);
		System.out.println("int value : " + val); // 11이 출력될 것이다.
		
		changeObjectRef(date);
		System.out.println("MyDate : " + date); //changeObjectRef 안을보면 새로운 객체를 생성해준거라서 date 랑 별개라고 여겨져, date가 그대로 출력됨.
		
		changeObjectAttr(date);
		System.out.println("int value : " + date); //changeObjectAttr메소드는 MyDate class 를 이용하여 date의 day와 month를 재설정 해준다
	}
}

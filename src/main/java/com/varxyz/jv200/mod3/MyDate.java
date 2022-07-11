package com.varxyz.jv200.mod3;

public class MyDate {
	//인스턴스 == 객체 == 오브젝트
	//인스턴스 변수
	private int day;
	private int month;
	private int year;
	
	//class 안에는 무조건 하나의 생성자가 있어야한다.
	//but, 생성자를 만들어주지않아도 default 생성자가 존재한다.
	//전역변수 초기화 시 기본값은 0 , 지역변수 초기화 시 기본값은 없음
	
	public MyDate(int day, int month, int year) { //생성자 생성 //int day 는 parameter 라고 부름
		this.day = day; //this.day 는 MyDate 바로 밑의 인스턴스 변수를 의미
		this.month = month;
		this.year = year;
	}
	
	public MyDate(MyDate date) { //생성자 생성
		this.day = date.day;
		this.month = date.month;
		this.year = date.year;
	}
	
	public void setDay(int day) { //day를 재설정 해주는 메소드
		this.day = day;
	}
	
	public void setMonth(int month) { //month를 재설정 해주는 메소드
		this.month = month;
	}
	
	public String toString() {
		return "day : " + day + ", month : " + month + ", year : " + year;
	}
}

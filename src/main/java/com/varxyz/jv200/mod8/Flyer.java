package com.varxyz.jv200.mod8;

/**
 * interface 란,
 * -. abstract메소드의 집합, 상수(public)
 * -. 인스턴스 생성 불가
 * -. 다중 상속 지원
 * @author Administrator
 *
 */

public interface Flyer {
	void fly(); //public이 생략
	void takeOff();
	void land();
//	void vehicle();
}
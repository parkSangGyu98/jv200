package com.varxyz.jv200.mod8;

public class FlyerTest {

	public static void main(String[] args) {
		Flyer f = new Airplane(); // 폴리모피즘
		Vehicle f2 = new Bird();
		
		f.takeOff();
//		f2.land();
		f2.vehicle(); //Vehicle을 상속시켜줬는데 왜 안되냐? , 그래서 타입을 바꿔주면 Flyer 클래스가 안먹힘
	}
}

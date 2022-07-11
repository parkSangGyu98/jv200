package com.varxyz.jv200.mod6;

public class Manager extends Employee { //부모 클래스 상속받은 자식 클래스
	public String department;

	//method overriding
	public String getDetails() { // 나 자신을 불러올때 -> this. // 부모를 불러올때 -> super.
		return super.getDetails() + "\nDepartment : " + department; //오버라이딩
	}
}

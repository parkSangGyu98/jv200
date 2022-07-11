package com.varxyz.jv200.mod5;

public class SmartPhone extends Product{
	private boolean apple = false;
	
	public SmartPhone(String name) {
		super(name);
		if(getName().startsWith("Apple")) {
			apple = true;
		}else {
			apple = false;
		}
	}
	
	public double getPrice() {
		if(apple) {
			return 1500.0;
		}
		else {
			return 1000.0;
		}
	}
	
	public String getPlatform() {
		if(apple) {
			return "apple";
		}
		else {
			return "Android";
		}
	}
	
}
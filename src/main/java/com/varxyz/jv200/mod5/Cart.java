package com.varxyz.jv200.mod5;

public class Cart {
	private Product[] products = new Product[3];
	
	public void addProduct(Product p) {
		for(int i = 0; i < products.length; i++) {
			if( products[i] == null ) {
				products[i] = p;
				break;
			}
		}
	}
	
	public Product[] getProducts() {
		return products;
	}
	
	public String getDetails() {
		StringBuilder sb = new StringBuilder();
		for (Product p : products) {
			sb.append("Name : ");
			sb.append(p.getName());
			sb.append("\nPrice : ");
			sb.append(p.getPrice());
			if(p instanceof SmartPhone) { //p는 SmartPhone의 인스턴스가 맞다면
				SmartPhone s = (SmartPhone)p;
				sb.append("\nPlatform : ");
				sb.append(s.getPlatform());
			}
			sb.append("\n----------------------\n");
		}
		return sb.toString();
	}
}
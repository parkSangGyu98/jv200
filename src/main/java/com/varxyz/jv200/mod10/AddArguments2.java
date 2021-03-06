package com.varxyz.jv200.mod10;

public class AddArguments2 {
	public static void main(String args[]) {
		try {
			int sum = 0;
			for(String arg : args) {
				sum += Integer.parseInt(arg); //arg를 정수로 변환해서 sum에 넣는다
			}
			System.out.println("Sum = " + sum);
		}catch(NumberFormatException nfe) {
			System.err.println("One of the command-line" + "arguments is not an Integer.");
		}
	}
}
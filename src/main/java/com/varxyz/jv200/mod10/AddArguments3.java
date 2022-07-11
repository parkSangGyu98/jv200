package com.varxyz.jv200.mod10;

public class AddArguments3 {
	public static void main(String args[]) {
		int sum = 0;
		for(String arg : args) {
			try {
				sum += Integer.parseInt(arg);		
			}catch(NumberFormatException nfe) {
				System.err.println("[" + arg + "] is not an Integer" + "and will not be included in the sum.");
			}
		}
		System.out.println("\nSum = " + sum);
	}
}
package com.ravi.factory;

public class ChocolateFactory {
	
	public static Chocolate getType(String type) {
		if(type.equalsIgnoreCase("white")) {
			return new WhileChocolate();
		}
		else if(type.equalsIgnoreCase("dark")) {
			return new DarkChocolate();
		}
		return null;
	}

}

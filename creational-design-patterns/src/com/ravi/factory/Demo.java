package com.ravi.factory;

public class Demo {

	public static void main(String[] args) {
		String chocolateType ="dark";
		Chocolate chocolate =ChocolateFactory.getType(chocolateType);
		System.out.println(chocolate.makeChocolate());
	}

}

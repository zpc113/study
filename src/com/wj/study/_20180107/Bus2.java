package com.wj.study._20180107;

public class Bus2 extends Car {

	public Bus2(int num, String name, int price, int driveType, int sum1, int sum2) {
		super(num, name, price, driveType, sum1, sum2);
		// TODO Auto-generated constructor stub
		System.out.println(num + "\t" + name + "\t" + price + "元/辆\t载客" + sum1 + "人");
	}
	
}

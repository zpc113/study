package com.wj.study._20180102;

public class Rectangle extends Shape {
	
	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		int c1 = 2 * ( a + b );
		System.out.println("长方形的周长是：" + c1);

	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		int s1 = a * b ;
		System.out.println("长方形的面积是：" + s1);

	}

}

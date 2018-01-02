package com.wj.study._20180102;

public class Circular extends Shape {
	

	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		double c2 = 2 * 3.14 * r ;
		System.out.println("圆形的周长是:" + c2);

	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		//double s2 = 3.14 * (r * r);
		//java中乘方用Math.pow(a,b)表示a的b次方
		double s2 = Math.pow(r,2) * 3.14;
		System.out.println("圆形的面积是:" + s2);

	}

}

package com.wj.study._20180115;

public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 91.5;
		Double b = new Double(a);
		Double c = a;
		System.out.println("装箱后的结果为：" + b + "和" + c);
		Double m = new Double(87.0);
		Double n = m.doubleValue();
		Double l = m;
		System.out.println("拆箱后的结果为：" + m + "和" + l);

	}

}

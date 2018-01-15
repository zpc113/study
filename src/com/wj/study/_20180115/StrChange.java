package com.wj.study._20180115;

public class StrChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//基本类型转换为字符串，三种方法
		int a = 9;
		String str1 = Integer.toString(a);//包装类的toString()方法
		String str2 = String.valueOf(a);//用String类的valueOf方法
		String str3 = a + "";//用基本类型加上一个空字符串
		//字符串转换为基本类型，两种方法
		String str = "12";
		int d = Integer.parseInt(str);//调用包装类的parseXxx静态方法
		int e = Integer.valueOf(str);//调用包装类的valueOf()方法转换为基本类型的包装类，会自动拆箱
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(d);
		System.out.println(e);
		
	}

}

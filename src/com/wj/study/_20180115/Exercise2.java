package com.wj.study._20180115;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double m = 78.5;
		String str1 = m + "";
		System.out.println("m 转换为String型后与整数20的求和结果为： " + (str1 + 20));
		String str = "180.20";
		Double a = Double.valueOf(str);
		System.out.println("str转换为Double类型后与整数20的求和结果为：" + (a + 20));
	}

}

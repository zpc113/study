package com.wj.study._20180115;

public class PackageType {
	
	public static void main(String[] args){
		//Integer 包装类的构造方法
		int m = 8 ;
		Integer n = new Integer(5);//定义Integer包装类对象，值为5
		Integer l = new Integer("7");//定义Integer包装类对象，值为7
		
		int score1 = 86;// 定义int类型变量，值为86
		Integer score2 = new Integer(score1);// 创建Integer包装类对象，表示变量score1的值
		double score3 = score2.doubleValue();// 将Integer包装类转换为double类型
		float score4 = score2.floatValue();// 将Integer包装类转换为float类型
		int score5 = score2.intValue();// 将Integer包装类转换为int类型
		System.out.println("Integer包装类：" + score2);
		System.out.println("double类型：" + score3);
		System.out.println("float类型：" + score4);
		System.out.println("int类型：" + score5);
		
		System.out.println(m);
		System.out.println(n);
		System.out.println(l);
		
		//基本类型和包装类之间的转换
		Integer a = new Integer(3);
		int b = a + 5;//将对象和基本类型进行运算
		System.out.println(b);
		
		//装箱
		int i = 10;
		Integer x = new Integer(i);//手动装箱
		Integer y = i;//自动装箱
		//拆箱
		Integer j = new Integer(8);
		int k = j.intValue();//手动拆箱为int类型
		int z = j;//自动拆箱为int类型
	}

}

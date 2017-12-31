package com.wj.study._20171231;

public class Text2 {
//引用类型转换
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s1 = new Son();
		Father father = s1;//自动类型转换,向上
		if (father instanceof Son){
		    Father s2 = (Son)father;//强制类型转换，向下
		} else {
			System.out.println("不能进行类型转换s2");
		}
		if (father instanceof Son2){
            Son2 s3 = (Son2)father;//编译时不报错，为Son2类型，运行时报错，为Son类型
		} else {
			System.out.println("不能进行类型转换s3");
		}
	}

}

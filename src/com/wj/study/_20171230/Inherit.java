package com.wj.study._20171230;

public class Inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father father = new Father();//初始化中的属性顺序，先对象中，后构造方法中
		System.out.println("父亲的年龄：" + father.age);
		father.craft();
		
	    Son son = new Son();
	    son.age = 10;
	    //son.name = "Malfoy";
	    //son.craft();
	    //son.method();
	    //System.out.println(son);//toString()方法输出哈希码（对象地址字符串）
	    Son son2 = new Son();
	    son2.age = 10;
	    if (son.equals(son2)){
	    	System.out.println("两个儿子相同。");
	    } else {
	    	System.out.println("两个儿子不同。");
	    }
	}

}

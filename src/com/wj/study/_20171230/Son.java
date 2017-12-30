package com.wj.study._20171230;

public class Son extends Father {
	int age;
	public void craft(){
		//方法的重写，优先调用子类的方法
    	System.out.println(name + age + "学了父亲的黑魔法。");
	}
	public Son(){
		super();//可不写，效果一样，若写，则放子类构造方法的第一行
		System.out.println("儿子的黑魔法。");
		int age = 20;
	}
	public void method(){
		System.out.println(super.age);//调用父类的属性
		System.out.println(age);//调用子类的属性
		super.craft();//调用父类方法
		craft();//调用子类方法
	}
}

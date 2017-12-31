package com.wj.study._20171231;

public class Text {
//多态
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father a1 = new Father();
		Father a2 = new Son();//子类不能指向父类
		Father a3 = new Son2();
		a1.craft();
		a2.craft();//重写的,没有该方法的继承父类
		a3.craft();
		//a2.action();//父类里面没有的方法，子类独有的不能调用
		Son a4 = new Son();
		a4.action();
		
		
	}

}

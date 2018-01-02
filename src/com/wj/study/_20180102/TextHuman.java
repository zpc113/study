package com.wj.study._20180102;

public class TextHuman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chinese a = new Chinese();
		a.method();
		American b = new American();
		b.method();
		//多态
		Human a1 = new Chinese();
		Human b1 = new American();
		a1.method();
		b1.method();
		
		//也可使用抽象类abstract，抽象方法

	}

}

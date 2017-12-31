package com.wj.study._20171231;

public class Rectangle extends Shape {
	// 因为Shape类你编辑了没有保存
	// 再说一遍，每停止一次编辑操作，就按Ctrl + shift + s 执行全局保存操作。
	// 那么怎么判断文件是否保存呢？
	// 你看这个Rectangle类，上面的选项卡上类名前面有一个* ， 这个符号代表文件没有保存。
	
	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
        System.out.println("长方形的周长");
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
        System.out.println("长方形的面积");
	}

}

package com.wj.study._20180102;

import java.util.Scanner;

public class Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle a1 = new Rectangle();
		Circular r1 = new Circular();
		Scanner input = new Scanner(System.in);
		System.out.println("请输入长方形的长：");
		a1.a = input.nextInt();
		System.out.println("请输入长方形的宽：");
		a1.b = input.nextInt();
		System.out.println("请输入圆形的半径：");
		r1.r = input.nextInt();
		a1.perimeter();
		a1.area();
		r1.perimeter();
		r1.area();
        
	}

}

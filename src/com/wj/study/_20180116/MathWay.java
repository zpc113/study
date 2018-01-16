package com.wj.study._20180116;

import java.util.Arrays;

public class MathWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 12.81;
		int b = (int) a;
		System.out.println("强制转换类型，返回整数：" + b);
		long c = Math.round(a);
		System.out.println("返回四舍五入后的整数：" + c);
		double d = Math.floor(a);
		System.out.println("返回小于参数的最大整数：" + d);
		double e = Math.ceil(a);
		System.out.println("返回小于参数的最小整数：" + e);
		int f =  (int) (Math.random()*100);//random();返回[0,1)之间的随机浮点数
		System.out.println("返回[0 ， 100 )之间的随机整数：" + f);
		
		
		
		//功能：定义一个包含 10 个元素的整型数组，通过随机产生 10 以内的随机数，
		//给数组中的每个元素赋值，并输出结果。
		int[] nums = new int[10];
		for (int i = 0 ; i < nums.length; i++){
			int x = (int) (Math.random() * 10);
			nums[i] = x;
		}
		System.out.println(Arrays.toString(nums));
		for (int num : nums){
			System.out.print(num + " ");
		}

	}

}

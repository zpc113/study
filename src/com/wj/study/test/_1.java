package com.wj.study.test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 给定一个整数数组，找出其中两个数满足相加等于你指定的目标数字。 
　　要求：这个函数twoSum必须要返回能够相加等于目标数字的两个数的索引，且index1必须要小于index2。
       请注意一点，你返回的结果（包括index1和index2）都不是基于0开始的。你可以假设每一个输入肯定只有一个结果。 
 * @author 和谐社会人人有责
 *
 */
public class _1 {

	public static int[] arr = {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9};
	
	public static void twoSum(int num) {
		int sum = 1;
		for (int i = 0 ; i < arr.length ; i ++ ){
			int num1 = arr[i];
			int num2 = num - num1;
			sum++;
			if (num1 < num2 ){
				for (int j = 0 ; j < arr.length ; j++){
				    if (num2 == arr[j]){
				    	System.out.println(j);
				    	int index1 = i ;
						int index2 = j ;
						System.out.println("两个索引位置分别是： index1 ," + index1 + "\t index2 ," + index2);
				    }
				}
		    }   
		}
	}
	
	public static void main(String[] args) {
		System.out.println("请输入一个正整数：");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if (num > 17 || num <= 2){
			System.out.println("输入错误！数组中的数字无法满足相加等于" + num );
		} else {
		    twoSum(num);
		}
		
	}
	
}

package com.wj.study.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 有两个单链表，代表两个非负数，每一个节点代表一个数位，数字是反向存储的，即第一个结点表示最低位，最后一个结点表示最高位。
 * 求两个数的相加和，并且以链表形式返回。 
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) 
　　Output: 7 -> 0 -> 8 
 * @author 和谐社会人人有责
 *
 */
public class _2 {
	
	public static void main(String args[]){
		List<Integer> arr1 = new ArrayList<Integer>();
		arr1.add(2);
		arr1.add(4);
		arr1.add(3);
		List<Integer> arr2 = new ArrayList<Integer>();
		arr2.add(5);
		arr2.add(6);
		arr2.add(4);
		// 把这两个list里面的数字转换为十进制的数，如 arr1 -> 342  arr2 -> 465
		// 然后再继续
		int sum3 = test1(arr1) + test1(arr2);
		List<Integer> arr3 = new ArrayList<Integer>();
		String temp = sum3 + "";
		System.out.println(temp);
		int length = temp.length();
        for (int i = 0 ; i < temp.length() ;i++){
        	String j = temp.charAt(temp.length() - 1 - i) + "";
        	int k = Integer.parseInt(j);
        	System.out.println(j);
			arr3.add(k);
		}
        System.out.println(arr3);
		
		
	}
	
	public static int test1(List<Integer> arr){
		int size = arr.size();
		String num = "";
		for (int i = size -1 ,j = size - 1 - i; i >= 0 ; i--){
			num = num + arr.get(i);
		}
		int sum = Integer.parseInt(num);
		System.out.println(sum);
		return sum;
	}

}

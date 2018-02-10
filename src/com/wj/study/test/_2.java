package com.wj.study.test;

import java.util.Scanner;

/**
 * 有两个单链表，代表两个非负数，每一个节点代表一个数位，数字是反向存储的，即第一个结点表示最低位，最后一个结点表示最高位。
 * 求两个数的相加和，并且以链表形式返回。 
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) 
　　Output: 7 -> 0 -> 8 
 * @author 和谐社会人人有责
 *
 */
public class _2 {
	
	public static void outPut(String a){
		for (int i = a.length()-1;i >= 0 ; i--){
			System.out.print(a.charAt(i));
			if (i == 0){
				System.out.println("");
			} else {
			    System.out.print("->");
			}
		}
		
	}
	
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入非负数1：");
		String a1 = scanner.next();
		outPut(a1);
		System.out.println("\n输入非负数2：");
		String a2 = scanner.next();
		outPut(a2);
		int a3 = Integer.parseInt(a1) + Integer.parseInt(a2);
		String a4 = a3 + "";
		System.out.println("两数相加的和为：" + a4);
		outPut(a4);
	}

}

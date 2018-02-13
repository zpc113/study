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
		int sum3 = test1(arr1) + test1(arr2);//1
		List<Integer> arr3 = new ArrayList<Integer>();
		int a = 0;
		for (int i = 0 ; sum3 >= (Math.pow(10, i));i++){
			int b = (int) (sum3/(Math.pow(10, i)));
			int c = (int) (b/10) ;
			int d = b - c*10 ;
			arr3.add(d);
		}
		System.out.println(arr3);
		
		
		
		
		
		int num1 = 0;//2
		int num2 = 0;
		for (int i = 0 ; i < arr1.size() ;i++){
			int temp = arr1.get(i);
			for (int j = 0 ;j < i ;j++ ){
				temp *= 10;
			}
			num1 += temp;
		}
		num1 += arr2.get(0);
		for (int i = 0 ; i < arr2.size() ;i++){
			int temp = arr2.get(i);
			for (int j = 0 ;j < i ;j++ ){
				temp *= 10;
			}
			num2 += temp;
		}
		num2 += arr2.get(0);
		
		//int j = sum3/100;
		//int k = (sum3-j*100)/10;
		//int l = sum3-j*100-k*10;
		//arr3.add(l);
		//arr3.add(k);
		//arr3.add(j);
        //System.out.println(arr3);
        //for (int i = 0 ; i < temp.length() ;i++){//3
        //	  String j = temp.charAt(temp.length() - 1 - i) + "";
        // 	  int k = Integer.parseInt(j);
        //	  System.out.println(j);
        //	  arr3.add(k);
      	//}
	}
	
	public static int test1(List<Integer> arr){
		//int size = arr.size();//3
		//String num = "";
		//for (int i = size -1 ,j = size - 1 - i; i >= 0 ; i--){
		//	num = num + arr.get(i);
		//}
		//int sum = Integer.parseInt(num);
		//System.out.println(sum);
		//return sum;
		int a = 0;//1
		for (int i = 0 ; i < arr.size();i++){
			int a1 = (int) (arr.get(i)*(Math.pow(10, i)));
			a = a + a1;
		}
		System.out.println(a);
		return a;
	}
		

}

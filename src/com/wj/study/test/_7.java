package com.wj.study.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Reverse digits of an integer. 
　　Example1: x = 123, return 321 
　　Example2: x = -123, return -321 
       输入一个整数对其进行翻转 
 * @author 和谐社会人人有责
 *
 */
public class _7 {
	public static void main(String[] args) {
		int num = -123890;
		String str1 = "";
		int e = 0;
	    if (num >= 0 ){
	    	String str = num + "";
		    for (int i = 0 ; num >= (Math.pow(10, i));i++){
				int b = (int) (num/(Math.pow(10, i)));
				int c = (int) (b/10) ;
				int d = b - c*10 ;
				str1 = str1 + d ;
	    	}
		    e = Integer.valueOf(str1);
	    	System.out.println(e);
	    } else {
	    	String str = ( 0 - num) + "";
	    	
	    	for (int i = 0 ; (-num) >= (Math.pow(10, i));i++){
				int b = (int) ((-num)/(Math.pow(10, i)));
				int c = (int) (b/10) ;
				int d = b - c*10 ;
				str1 = str1 + d ;
	    	}
		    e = Integer.valueOf(str1);
		    int f = - e ;
	    	System.out.println(f);
	    		
	    }
	}
}

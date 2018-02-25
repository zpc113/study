package com.wj.study.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 给定一个字符串S，找出它的最大的回文子串，你可以假设字符串中存在唯一的最长回文子串 
 *
 */
public class _5 {
	
	public static void main(String[] args) {
		String s = "abcbaabcdefedcbaabcdcba";
		List<String> s1 = new ArrayList<String>() ;
		List<String> s3 = new ArrayList<String>() ;
		for (int i = 1 ; i <= s.length(); i ++){
			for (int j = 0 ; j < i; j++){
				String s2 = s.substring(j, i);
				s1.add(s2);
			}
		}
		System.out.println(s1);
		
		for (int i = 0 ; i < s1.size() ; i ++){
			int length = s1.get(i).length();
			int half = length / 2 ;
			boolean no = false;
			for (int j = 0 ; j <= half ; j++){
				char temp1 = s1.get(i).charAt(j);
				char temp2 = s1.get(i).charAt(length - 1 - j);
				if (temp1 == temp2 ){
					no = true;
				} else {
					no = false;
					break;
				}
			}
			if (no){
				s3.add(s1.get(i));
			}
		}
		System.out.println(s3);
		int max = s3.get(0).length();
		for( int i = 0 ; i < s3.size() ; i++){
			if (s3.get(i).length() > max ){
				max = s3.get(i).length();
				s3.add(0, s3.get(i));
			}
		}
		System.out.println(max);
		System.out.println(s3.get(1));
	}
	
}

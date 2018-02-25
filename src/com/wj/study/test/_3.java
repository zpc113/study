package com.wj.study.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 给定一个字符串，找字符中的最大非重复子串 
 * For example, the longest substring without repeating letters for “abcabcbbcdefbbdefbbghdjsk” is “bghdjsk”,  
 * which the length is 7. For “bbbbb” the longest substring is “b”, with the length of 1.
 * @author 和谐社会人人有责
 *
 */
public class _3 {
	public static void main(String[] args) {
		String str = "abcabcbbcdefbbdefbbghdjsk";
		List<String> str1 = new ArrayList<String>() ;
		List<String> str4 = new ArrayList<String>() ;
		for (int i = 1 ; i <= str.length(); i ++){
			for (int j = 0 ; j < i; j++){
				String str2 = str.substring(j, i);
				str1.add(str2);
				//System.out.println(str2);
				for (int k = 0 ; k < str2.length(); k++){
					char ch = str.charAt(k);
					if (str2.indexOf(ch) != str2.lastIndexOf(ch)){
						str4.add(str2);
						//System.out.println(str2);
					}
				}
			}
		}
		//System.out.println(str1);
		//System.out.println(str4);
		str1.removeAll(str4);
		//System.out.println(str1);
		int max = str1.get(0).length();
		for( int i = 0 ; i < str1.size() ; i++){
			if (str1.get(i).length() > max ){
				max = str1.get(i).length();
				str1.add(0, str1.get(i));
			}
		}
		System.out.println(max);
		System.out.println(str1.get(0));
		toCharArray(str);
	}
	
	
	
	public static void toCharArray(String str){
		char[] ch = str.toCharArray();
		String str1 = "";
		List<String> str2 = new ArrayList<String>() ;
		for (int i = 0 ; i < ch.length ; i ++){
			if (!str1.contains(ch[i] + "")){
				str1 += ch[i];
				//System.out.println("!!!" + str1);
			} else {
				str2.add(str1);
				str1 = ch[i] + "";//直接从不重复的那一位开始加
				//System.out.println(str1);
			}
		}
		str2.add(str1);
		String max = Collections.max(str2);
		System.out.println(str2.toString());
		System.out.println(max);
	}
}

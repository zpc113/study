package com.wj.study.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 写一个函数找出一个字串所数组中的最长的公共前缀。
 * @author 和谐社会人人有责
 *
 */
public class _14 {
	public static void main(String[] args) {
		
		String[] strArr = {"abcdef" , "abcghskg" , "acduregjsa" , "acfkdssssa" , "auerjkfdsfs" , "akugoendm"};
		// 最长公共前缀  abc
		List<String> arr = new ArrayList<String>() ;
		int min = strArr[0].length();
		for (int i = 0 ; i < strArr.length - 1 ; i++){
			if (strArr[i + 1].length() < min ){
				min = strArr[i].length();
			}
			//arr1.add(strArr[i]);
			String lang = "";
			for (int j = 0 ; j < min ; j++ ){
				String str = strArr[i].charAt(j) + "";
				String str1 = strArr[i+1].charAt(j) + "";
				if (str.equals(str1)){
					lang = lang + str ;
				} else {
					break;
				}
				arr.add(lang);
			}
		}
		System.out.println(arr.toString());
		int max =  0 ;
		for( int i = 0 ; i < arr.size() ; i++){
			if (arr.get(i).length() > max ){
				max = arr.get(i).length();
				arr.add(0, arr.get(i));
			}
		}
		System.out.println(arr.get(0));
	}
}

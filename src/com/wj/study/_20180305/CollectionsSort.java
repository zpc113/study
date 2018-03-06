package com.wj.study._20180305;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class CollectionsSort {
	/**
	 * 创建List<String>，往其中添加十条随机字符串
	 * 每条字符串的长度为10以内的随机整数
	 * 每个字符串的每个字符都为随机生成的字符，字符可以重复
	 * 每条随机字符串不可重复
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> stringList = new ArrayList<String>();
		String newString = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		Random random = new Random();
		Integer length;
		Integer k;
		String str = "";
		for (int i = 0 ; i < 10 ; i ++){
			do {
				str = "";
				do{
					length = random.nextInt(10);//10以内的长度
				} while (length == 0);
				for(int j = 0 ; j < length ; j ++){
					k = random.nextInt(61);
					str = str + newString.charAt(k);
				}
				stringList.add(str);
			} while (!stringList.contains(str));
			
		}
		System.out.println(stringList);
		for (String string : stringList) {
			System.out.println(string);
		}
	}

}

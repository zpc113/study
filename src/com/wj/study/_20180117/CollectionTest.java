package com.wj.study._20180117;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollectionTest {
	//3.4
	/**
	 * 通过collections.sort()方法,对Integer泛型的list集合进行排序
	 * 对string泛型的list进行排序
	 * 对其他类型的泛型的list进行排序，以Student为例
	 * @param args
	 */
	
	
	/*
	 * 通过collections.sort()方法,对Integer泛型的list集合进行排序
	 * 创建一个Integer泛型的list方法，插入10个100以内的不重复随机数
	 * 不能使用基本类型作为泛型，若要使用，则需用其包装类
	 */
	public void sort1(){
		List<Integer> integerList = new ArrayList<Integer>();
		Random random = new Random();//生成随机整数
		Integer k ;
		for (int i = 0 ; i < 10 ; i++){
			do {
				k = random.nextInt(100);//100以内的随机整数
			} while (integerList.contains(k));
			integerList.add(k);
			System.out.println("成功添加整数 ： " + k);
		}
		System.out.println("------------排序前-----------");
		for (Integer integer : integerList) {
			System.out.println("元素：" + integer);
		}
		System.out.println("------------排序后-------------");
		Collections.sort(integerList);
		for (Integer integer : integerList) {
			System.out.println("元素：" + integer);
		}
	}
	
	//对string泛型的list进行排序,小到大，0-9-A-Z-a-z
	public void Sort2(){
		List<String> stringList = new ArrayList<String>();
		stringList.add("mine");
		stringList.add("you");
		stringList.add("well");
		System.out.println("------------排序前-----------");
		for (String string : stringList) {
			System.out.println("元素：" + string);
		}
		System.out.println("------------排序后-------------");
		Collections.sort(stringList);
		for (String string : stringList) {
			System.out.println("元素：" + string);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionTest co = new CollectionTest();
		co.sort1();
		co.Sort2();

	}

}

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
	
	
	//3.7
	//对其他类型的泛型的list进行排序，以Student为例
	public void sort3(){
		List<Student> studentList = new ArrayList<Student>();
		List<Integer> k = new ArrayList<Integer>();
		Random random = new Random();
		//生成3个随机1000以内不重复的正整数作为id
		Integer j;
		for(int i = 0 ; i < 3 ; i++){
			do {
				j = random.nextInt(1000);//1000以内的随机整数
			} while (k.contains(j));
			k.add(j);
		}
		System.out.println(k);
		studentList.add(new Student(k.get(0) + "","金毛"));//id为string类型
		studentList.add(new Student(k.get(1) + "","二哈"));
		studentList.add(new Student(k.get(2) + "","田园"));
		System.out.println("------------排序前-----------");
		for (Student student : studentList) {
			System.out.println("学生：" + student.id + "," + student.name);
		}
		//排序时元素要实现comparable接口,可比较的
		/*
		 *comparable---默认比较规则，其实现类是compareTo（）方法，返回正数表示大，负数表示小，0表示相等
		 *comparator---临时比较规则 ，比较工具接口，其实现类是compare（）方法
		 *java集合框架：Collection接口，Map接口，Comparable接口，Collections工具类，Comparator接口
		 */
		Collections.sort(studentList);
		System.out.println("------------排序后-----------");
		for (Student student : studentList) {
			System.out.println("学生：" + student.id + "," + student.name);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionTest co = new CollectionTest();
		//co.sort1();
		//co.Sort2();
		co.sort3();

	}

}

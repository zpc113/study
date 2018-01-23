package com.wj.study._20180117;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric {
	//1.23,泛型
	//泛型,<>Course的List属性
	public List<Course> courses;
	
	public TestGeneric(){
		this.courses = new ArrayList<Course>();//小括号表示构造方法
	}
	
	public void testAdd(){
		Course cr1 = new Course("1","大学语文");
		courses.add(cr1);
		//泛型集合中，不能添加泛型规定以外的东西
		Course cr2 = new Course("2","大学英语");
		courses.add(cr2);
	}
	
	//遍历循环测试
	public void testForEach(){
		for (Course cr : courses){//在规定时已经规定了泛型，可以直接用Course类型
			System.out.println(cr.id + ":" + cr.name);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestGeneric i = new TestGeneric();
		i.testAdd();//要调用要用的方法
		i.testForEach();

	}

}

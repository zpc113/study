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
		//泛型集合中，不能添加泛型及其子类型对象规定以外的东西，否则会报错
		Course cr2 = new Course("2","大学英语");
		courses.add(cr2);
	}
	
	//遍历循环测试
	public void testForEach(){
		for (Course cr : courses){//在规定时已经规定了泛型，可以直接用Course类型，而不用Object类型再进行转换。
			System.out.println(cr.id + ":" + cr.name);
		}
	}
	//1.24泛型2
	//泛型集合可以添加泛型类型的对象的实例，也可以添加泛型的子类型集合的对象的实例
	public void testChild(){
		ChildCourse ccr = new ChildCourse();
		ccr.id = "3";
		ccr.name = "java";
		courses.add(ccr);
	}
	
	//泛型不能使用基本类型
	public void testBasicType(){
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		System.out.println("要用基本类型的包装类" + list.get(0));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestGeneric i = new TestGeneric();
		i.testAdd();//要调用要用的方法
		i.testForEach();
		i.testChild();
		i.testForEach();
		i.testBasicType();

	}

}

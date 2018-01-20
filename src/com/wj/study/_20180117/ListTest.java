package com.wj.study._20180117;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest {
	//创建List属性
	public List coursesToSelect;//备选课程
	
	public ListTest(){//用于往coursesToSelect中添加备选课程
		this.coursesToSelect = new ArrayList();
	}
	
	public void testAdd(){
		//创建一个课程对象，并通过调用add方法，添加到备选课程List中
		Course cr1 = new Course("1" , "数据结构");
		coursesToSelect.add(cr1);//add方法1
		//对象存入集合都变成Object类型，取出时需要类型转换,
		Course temp = (Course) coursesToSelect.get(0);
		System.out.println("添加了课程：" + temp.id + ":" + temp.name);
		
		Course cr2 = new Course("2" , "c语言");
		coursesToSelect.add(0,cr2);
		//add方法2，可以指定具体位置,若数字大于长度，会抛出数组下标越界异常
		Course temp2 = (Course) coursesToSelect.get(0);
		System.out.println("添加了课程：" + temp2.id + ":" + temp2.name);
		
		coursesToSelect.add(cr1);//集合内的元素可以重复
		Course temp0 = (Course) coursesToSelect.get(2);
		System.out.println("添加了课程：" + temp0.id + ":" + temp0.name);
		
		Course[] course = {new Course("3","数学"),new Course("4","汇编语言")};
		coursesToSelect.addAll(Arrays.asList(course));//addAll方法1
		Course temp3 = (Course) coursesToSelect.get(3);//get获取元素
		Course temp4 = (Course) coursesToSelect.get(4);
		System.out.println("添加了两门课程：" + temp3.id + ":" + temp3.name + "\t" + temp4.id + ":" + temp4.name);
	    
		Course[] course2 = {new Course("5","高等数学"),new Course("6","语言")};
		coursesToSelect.addAll(1, Arrays.asList(course2));//addAll方法2
		Course temp5 = (Course) coursesToSelect.get(1);
		Course temp6 = (Course) coursesToSelect.get(2);
		System.out.println("添加了两门课程：" + temp5.id + ":" + temp5.name + "\t" + temp6.id + ":" + temp6.name);
	}
	
	
	//1.20,取得List中的元素的方法
	//用size方法
	public void testGet(){
        int size = coursesToSelect.size();//通过调用size方法获取长度
	    System.out.println("有如下课程(size)：");
	    for (int i = 0 ; i < size ; i++){
	        Course cr = (Course) coursesToSelect.get(i);
	        System.out.println("课程" + cr.id + ":" + cr.name);
	    }
	}
	 
	//通过迭代器(iterator)来遍历List,返回当前集合中的每个元素,本身不能存储元素,即不能单独存在，需要集合
	public void testIterator(){
		Iterator it = coursesToSelect.iterator();
		System.out.println("有如下课程(iterator):");
		while (it.hasNext()){//如果有元素就返回真值
			Course cr = (Course) it.next();
			System.out.println("课程" + cr.id + ":" + cr.name);
		}
	}
	
	
	//通过for each方法访问集合
	public void testForEach(){
		for (Object obj : coursesToSelect){
			Course cr = (Course) obj;
			System.out.println("课程" + cr.id + ":" + cr.name);
		}
	}
	    
	
	public static void main(String[] args){
		ListTest lt = new ListTest();
		lt.testAdd();
		lt.testGet();
		lt.testIterator();
		lt.testForEach();
	}

}

package com.wj.study._20180117;
//1.27   HashMap,无序
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.omg.Messaging.SyncScopeHelper;

public class MapTest {
	//用来承装学生类型对象
	public Map < String , Student > students;
	
	//在构造器中初始化students属性
	public MapTest(){
		this.students = new HashMap <String,Student>();
	}
	
	/*
	 * 测试添加：输入学生ID，判断是否被占用，
	 * 若被占用，则输入姓名，创建新学生对象，
	 * 并且，添加到students中
	 */
	public void testPut(){
		Scanner input = new Scanner(System.in);
		int i = 0 ;//?
		while (i < 3){
			System.out.println("请输入学生ID：");
			String ID = input.next();
			Student st = students.get(ID);
			if (st == null){
				System.out.println("请输入学生姓名：");
				String name = input.next();
				Student newStudent = new Student(ID,name);
				students.put(ID, newStudent);
				System.out.println("成功添加学生：" + students.get(ID).name );
				i++;
			} else {
				System.out.println("该学生ID已存在！");
				continue;
			}
		}
	}
	
	/*
	 * 测试Map的KeySet方法,返回的是键的类型
	 */
	public void testKeySet(){
		Set<String> KeySet = students.keySet();
		//取得students的容量
		System.out.println("总共有" + students.size() + "个学生！");
		//用遍历的方法取得每个键，再调用get方法取得对应的v。
		for (String stuId : KeySet) {
			Student st = students.get(stuId);
			if (st != null)
				System.out.println("学生：" + st.name);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapTest mt = new MapTest();
	    mt.testPut();
		mt.testKeySet();
	}

}

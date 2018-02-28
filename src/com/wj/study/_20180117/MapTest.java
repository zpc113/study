package com.wj.study._20180117;
//1.27   HashMap,无序
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import javax.sound.midi.Synthesizer;

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
	
	//1.29
	//测试删除Map中的映射
	
	public void testRemove(){
		Scanner input = new Scanner(System.in);
		while (true){
			System.out.println("请输入需要删除的学生ID：");
			String ID = input.next();
			Student st = students.get(ID);//判断该ID是否有对应的学生
			if (st == null){
				System.out.println("未找到该学生！");
				continue;
			}
			students.remove(ID);
			System.out.println("成功删除学生：" + st.name);
			break;
		}
	}
	
	
	//通过entrySet方法来遍历循环Map,获得所有键值对
	public void testEntrySet(){
		Set < Entry < String,Student> > entrySet = students.entrySet();
		for (Entry <String , Student> entry : entrySet){
			System.out.println("取得键：" + entry.getKey());
			System.out.println("取得值：" + entry.getValue().name);//getValue返回的是Student
		}
	}
	
	//利用put方法修改Map中的已有映射
	public void testModify(){
		System.out.println("请输入要修改的学生ID：");
		Scanner input = new Scanner(System.in);
		while (true){
			String stuID = input.next();
			Student student = students.get(stuID);
			if (student == null){
				System.out.println("该ID不存在！请重新输入！");
				continue;
			}
			System.out.println("当前学生信息：" + student.name);
			System.out.println("请输入新学生的姓名：");
			String name = input.next();
			Student newStudent = new Student(stuID,name);
			students.put(stuID, newStudent);
			System.out.println("修改成功！");
			break;
		}
		
	}
	
	
	/*2.24
	 * 判断Map中是否包含某个Key值或者某个Value值
	 */
	public void testContainsKeyOrValue (){
		//用containsKey()方法判断是否包括某个Key值，containsValue（）某个Value值
		System.out.println("请输入学生id:");
		Scanner input = new Scanner(System.in);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapTest mt = new MapTest();
	    mt.testPut();
		mt.testKeySet();
		//mt.testRemove();
		//mt.testEntrySet();
		mt.testModify();
		mt.testEntrySet();
	}

}

package com.wj.study._20180117;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//1.25   Set
public class SetTest {
	
	public List<Course> coursesToSelect;
	
	private Scanner input;
	
	public SetTest(){
		coursesToSelect = new ArrayList<Course>();
		input = new Scanner(System.in);//在构造器中初始化
	}
	
	public void testAdd(){
		Course cr1 = new Course("1" , "数据结构");
		coursesToSelect.add(cr1);
		Course temp1 = (Course) coursesToSelect.get(0);
		Course cr2 = new Course("2" , "c语言");
		coursesToSelect.add(0,cr2);
		Course temp2 = (Course) coursesToSelect.get(0);
		Course[] course = {new Course("3","数学"),new Course("4","汇编语言")};
		coursesToSelect.addAll(Arrays.asList(course));
		Course temp3 = (Course) coursesToSelect.get(2);
		Course temp4 = (Course) coursesToSelect.get(3);
		Course[] course2 = {new Course("5","高等数学"),new Course("6","语言")};
		coursesToSelect.addAll(1, Arrays.asList(course2));
		Course temp5 = (Course) coursesToSelect.get(1);
		Course temp6 = (Course) coursesToSelect.get(2);
		
	}
	
	public void testForEach(){
		System.out.println("有如下课程(for each):");
		for (Object obj : coursesToSelect){
			Course cr = (Course) obj;
			System.out.println("课程" + cr.id + ":" + cr.name);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetTest st = new SetTest();
		st.testAdd();
		st.testListContains();
		st.testForEach();
		//创建一个学生对象
		Student student = new Student("1" , "小猫");
		System.out.println("欢迎" + student.name + "进行选课！");
		Scanner input = new Scanner(System.in);
		for (int i = 0 ; i < 3 ; i++){
			System.out.println("请输入你想要选的课程ID：");
			String num = input.next();
			for (Course cr : st.coursesToSelect){//set中加入的某个对象，无论保留多少该对象，最终只会保留一个。且保留的是第一个，可以保留空对象即null。
				if (cr.id.equals(num)){
					student.Courses.add(cr);//把cr加入学生选的课程
			    }
			}
		}
		st.testForEachForSet(student);
	}
	public void testForEachForSet(Student student){
		//打印输出，学生所选的课程
		System.out.println("共选择了" + student.Courses.size() + "门课！");
		for(Course cr : student.Courses){
			System.out.println(student.name + "选了如下课程" + cr.id + ":" + cr.name);
		}

	}
	
	
	//1.31 
	//测试List的contains方法
	public void testListContains(){
		Course course = coursesToSelect.get(0);
		System.out.println("取得课程：" + course.name);
		System.out.println("备选课程中是否包含课程：" + course.name + coursesToSelect.contains(course));
	    
		System.out.println("请输入课程名称：");
		String name = input.next();
		//创建一个新的课程对象，ID和名称与course对象完全一样,并不包含该对象
		Course course2 = new Course();
		course2.name = name;
		System.out.println("新创建的课程为：" + course2.name);
		System.out.println("备选课程中是否包含课程：" + course2.name + coursesToSelect.contains(course2));
		
		//2.6
		//通过indexOf的方法来取得某元素的位置,lastIndexof方法：如果有相同的元素，则会返回最后一个的位置
		//没有该元素出现的话，两个方法都会返回-1
		if (coursesToSelect.contains(course2)){
			System.out.println("课程：" + course2.name + "索引的位置：" + coursesToSelect.indexOf(course2));
			
		}
	}

}

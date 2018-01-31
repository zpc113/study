package com.wj.study._20180117;

public class Course {
	public String id;
	public String name;
	public Course (String id, String name){
		this.id = id;
		this.name = name;
	}
	public Course (){
		
	}
	
	
	//1.31.重写equals方法,判断List中是否存在课程
	public boolean equals(Object obj){//equals是布尔型的
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Course))//instanceof 用来在运行时指出对象是否是特定类的一个实例
			return false;
		Course course = (Course) obj;
		if (this.name == null){
			if (course.name == null)
				return true;
			else 
				return false;
		} else {
			if (this.name.equals(course.name))
				return true;
			else
				return false;
		}
	}
	

}

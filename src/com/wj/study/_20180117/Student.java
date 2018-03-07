package com.wj.study._20180117;

import java.util.HashSet;
import java.util.Set;

public class Student implements Comparable<Student>{
	public String id;
	public String name;
	public Set<Course> Courses;
	public Student(String id , String name){
		this.id = id;
		this.name = name;
		this.Courses = new HashSet<Course>();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Student))
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	//3.7
	public int compareTo(Student o) {//compareTo（）方法，返回正数表示大，负数表示小，0表示相等
		// TODO Auto-generated method stub
		return this.id.compareTo(o.id);//用当前的id和比较参数的id进行比较，将比较对象id的结果作为比较对象的结果来返回
	}

}

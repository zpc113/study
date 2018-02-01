package com.wj.study._20180201;

import java.util.HashSet;
import java.util.Set;

public class Student {
	public String id;
	public String name;
	public Set<Course> Courses;
	public Student(String id , String name){
		this.id = id;
		this.name = name;
		this.Courses = new HashSet<Course>();
	}

}

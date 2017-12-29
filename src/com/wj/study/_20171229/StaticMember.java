package com.wj.study._20171229;
//静态内部类
public class StaticMember {
	private static int score = 84;
	private int score1 = 99;
	public static class Inner{
		int score = 91;
	    public void text(){
	    	//访问外部类的静态成员，和内部类的静态成员重名时，外部类名.静态成员
		    System.out.println("访问外部类中的score：" + StaticMember.score);
		    System.out.println("访问内部类中的score：" + score);
		  //访问外部类的非静态成员，不能直接访问，new 外部类名().静态成员
		    System.out.println("访问外部类中的score1：" + new StaticMember().score1);
	    }
	}
	public static void main(String[] args){
		Inner num =new Inner();//直接创建内部类的对象
		num.text();
	}

}

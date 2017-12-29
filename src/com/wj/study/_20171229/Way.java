package com.wj.study._20171229;
//方法内部类
public class Way {
	private String name = "爱慕课";
	public void show(){
	    class Inner{//不用访问控制符和static
	    	int score = 83;
	    	public int getScore(){
	    		return score + 10;
	    	}
	    }
	    Inner i = new Inner();
	    int newScore = i.getScore();//调用，接收
	    System.out.println("姓名：" + name);
	    System.out.println("加分后成绩：" + newScore);
	}
	public static void main(String[] args){
		Way mo = new Way();
		mo.show();
	}
}

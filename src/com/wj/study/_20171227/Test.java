package com.wj.study._20171227;

public class Test {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		//NewStudy study = new NewStudy();
		//NewStudy study1 = new NewStudy("绿色","中号","中性");
	//}
	//static int score1 = 86;
	//static int score2 = 92;
	//public static int sum(){
	//	int sum = score1 + score2 ;
	//	return sum;
	//}
	//public static void main(String[] args){
	//	int allscore = sum();
	//	System.out.println("总分：" + allscore);
	//}
     String name;
     String sex;
     static int age;
     public Test(){
    	 name = "tom";
    	 System.out.println("通过构造方法初始化name");
     }
     {
    	 sex = "男";
    	 System.out.println("通过初始化块初始化sex");
     }
     static {
    	 age = 20;
    	 System.out.println("通过静态初始化块初始化age");
     }
     public void show(){
    	 System.out.println("姓名：" + name + "，性别：" + sex + "，年龄：" + age);
     }
     public static void main(String[] args){
    	 Test zhixing = new Test();
    	 zhixing.show();
     }
}

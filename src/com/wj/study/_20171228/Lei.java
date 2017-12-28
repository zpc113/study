package com.wj.study._20171228;

public class Lei {//外部类
	//内部类
	//public class Inner{//内部类
	//	public void show(){//内部类的方法
	//		System.out.println("welcome to imooc!");
	//	}
	//}
	//public static void main(String[] args){
	//	Lei hi = new Lei();//创建外部类对象
	//	Inner i = hi.new Inner();//创建内部类对象
	//	i.show();//调用内部类对象的方法
	//}
	
	//成员内部类
	private String name = "imooc！";
	int age = 20;
	public class Inner{
		String name = "爱慕课！";
		public void show(){
			System.out.println("外部类中的name：" + Lei.this.name);
			System.out.println("内部类中的name：" + name);
			System.out.println("外部类中的age：" + age);
		}
	}
	public static void main(String[] args){
		Lei hi = new Lei();
		Inner i = hi.new Inner();
		i.show();
	}

}

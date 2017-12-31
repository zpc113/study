package com.wj.study._20171230;

public class Son extends Father {
	int age = 0;
	public void craft(){
		//方法的重写，优先调用子类的方法
    	System.out.println(name + age + "学了父亲的黑魔法。");
	}
	public Son(){
		super();//可不写，效果一样，若写，则放子类构造方法的第一行
		System.out.println("儿子的黑魔法。");
	}
	public void method(){
		System.out.println(super.age);//调用父类的属性
		System.out.println(age);//调用子类的属性
		super.craft();//调用父类方法
		craft();//调用子类方法
	}
	@Override
	public String toString() {
		return "Son [age=" + age + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)//引用的地址是否相同，this表示son，obj表示son2
			return true;
		if (obj == null)
			return false;
		/*
		 * getClass()得到类对象，描述类的代码信息，属性、类型、变量名、方法
		 * new的时候得到类的对象，值的信息
		*/
		if (getClass() != obj.getClass())//判断两个对象的类型是否相同
			return false;
		Son other = (Son) obj;//将传入的对象转换为Son类型，同类型才能进行属性比较
		if (age != other.age)//判断两个对象属性值是否相等
			return false;
		return true;
	}
	
}

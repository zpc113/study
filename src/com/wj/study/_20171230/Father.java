package com.wj.study._20171230;
//是Object的子类，则子类也是其子类
public class Father extends Object{//用final修饰时，不能被继承
    public int age = 30;//private修饰的时候不能继承。
    //用final时，不能在其他位置进行改值，未赋值时，需在构造方法中赋值，不然会报错。
    //final修饰局部变量或者成员变量时，也不能改变，即为常量。
    public String name;
    public void craft(){//用final修饰时，不能重写
    	System.out.println(name + age + "父亲的黑魔法。");
    }
    public Father(){//初始化，先执行父亲，后执行子类
    	//若子类构造方法中没有显示调用父类的构造方法，父类有参，且未定义无参的构造方法，则编译出错
    	System.out.println("父亲的黑魔法。");
    	age = 40;
    }
    
}

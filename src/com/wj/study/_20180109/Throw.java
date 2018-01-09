package com.wj.study._20180109;

public class Throw {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Throw a = new Throw();
		a.method(5, 1);
		a.computer();
		a.computer1();

	}
	//调用者处理异常，处理方法在上层
	public void method (int i,int j) throws Exception{
    	if (j == 0){
    		throw new Exception("两数相除，除数不能为零！");
    	} else {
    		System.out.println("结果为：" + i/j);
    	}
	
    }
	//自身处理异常，处理方法在本层
    public void computer(){//1需要用try-catch语句来捕获或者2抛给更上一级的去处理
		
		try{
			method(5,0);
		} catch(Exception e) {
			System.out.println("hi" + e.getMessage());
		}
	}
    //调用者处理异常，处理方法在上层
    public void computer1() throws Exception{//2
    	
    	method(5,0);
    }

}

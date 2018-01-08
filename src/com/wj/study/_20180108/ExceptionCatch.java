package com.wj.study._20180108;

public class ExceptionCatch {
//用try-catch-finally语句处理异常
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionCatch a = new ExceptionCatch();
		int result = a.text();
		System.out.println("text方法执行了，返回值为：" + result);
		int result2 = a.text2();
		System.out.println("text2方法执行了，返回值为：" + result2);
		int result3 = a.text3();
		System.out.println("text3方法执行了，返回值为：" + result3);

	}
	public int text(){
		int divider = 10;
		int result = 1;
		try{
		    while (divider > -1){
			    divider --;
			    result = result + 100/divider;
		    }
		    return result;
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("循环异常了！");
			return -1;
		}
	}
	public int text2(){
		int divider = 10;
		int result = 1;
		try{
		    while (divider > -1){
			    divider --;
			    result = result + 100/divider;
		    }
		    return result;
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("循环异常了！");
			return result = 9;
		} finally {
			System.out.println("finally执行了！");
			System.out.println("result的值是：" + result);
		}
	}
	public int text3(){//处理顺序，catch，finally，其他
		int divider = 10;
		int result = 1;
		try{
		    while (divider > -1){
			    divider --;
			    result = result + 100/divider;
		    }
		} catch(Exception e) {//处理顺序：先子类，后父类
			e.printStackTrace();
			System.out.println("循环异常了！");
		} finally {//善后，关闭链接或关闭已打开的文件等善后工作
			System.out.println("finally执行了！");
			System.out.println("result的值是：" + result);
		}
		System.out.println("text3执行完毕!");
		return 111;
	}

}

package com.wj.study._20180110;

public class ChainTest {
	/*
	 * 异常链
	 * 把捕获的异常包装成新异常，再在新的异常里添加对原始异常的引用，再把新异常抛出
	 * test1()把"跑调"异常抛出
	 * test2()把"跑调"异常捕获并包装成运行时异常，继续抛出
	 * main方法，调用test2()，尝试捕获test2()方法抛出的异常
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChainTest a = new ChainTest();
		try {
			a.test2();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public void test1() throws SingException{
		throw new SingException("唱跑调了！");
	}
	public void test2(){
		try {
			test1();
		} catch (SingException e) {
			// TODO Auto-generated catch block
			RuntimeException newExc = new RuntimeException("唱歌跑调太痛苦！");//实现异常链，方法1
			newExc.initCause(e);
			//RuntimeException newExc = new RuntimeException(e);//方法2
			throw newExc;
		}
	}
	

}

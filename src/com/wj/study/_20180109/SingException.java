package com.wj.study._20180109;

import java.util.Arrays;

public class SingException extends Exception{
	//自定义异常必须继承Java类库中意思相近的异常类型或者继承基类Exception
	public SingException (){
		//无参构造方法
		try{
		int[] sing =new int[5];
		for(int i = 0; i >= 0;i++ ){
			sing[i] = i + 1;
			System.out.println(Arrays.toString(sing));
		}
		} catch (Exception e){ 
			e.printStackTrace();
			System.out.println("循环异常了！");
		}
				
	}

	public SingException (int i,int j){//含参构造方法
		super();//调用父类
		if (j == 0){
    		try {
				throw new Exception("两数相除，除数不能为零！");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	} else {
		System.out.println("结果为：" + i/j);
    	}
	}
	
}
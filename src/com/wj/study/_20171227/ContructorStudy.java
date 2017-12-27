package com.wj.study._20171227;
/**
 * 构造方法学习
 * @author 汪晶
 *
 */
public class ContructorStudy {
	String color ;
	String size ;
	String style ;
    public ContructorStudy(){
    	System.out.println("这是无参的！");
    }
    public ContructorStudy(String color1 , String size1 , String style1){
    	if (color1 == "白色"){//第七点
    		color1 = "红色";
    		System.out.println("没有白色的衣服了！");
    	} else {
    		System.out.println("恭喜你抢到了你喜欢的衣服！");
    	}
    	color = color1 ;
    	size = size1 ;
    	style = style1 ;
    	System.out.println("这是有参的！");
    }
}

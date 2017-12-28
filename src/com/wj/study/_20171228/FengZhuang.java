package com.wj.study._20171228;

public class FengZhuang {
	private String color;
	private String size;
	private String style;
	
	public void selectColor(){
		System.out.println("selectColor");
	}
	
	public String getColor() {//自动生成getter、setter，source
		return color;
	}
	public void setColor(String color) {
		this.color = color;//this关键字，操作当前对象的属性
		this.selectColor();//this关键字，调用当前对象的方法
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}

	//public String getColor(){//封装:set设值，get取值，调用看需要
	//	return color;
	//}
	//public void setColor(String newColor){
	//	color = newColor;
	//}
    
}

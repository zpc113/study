package com.wj.study._20171228;

public class FengZhuang {
	private String color;
	private String size;
	private String style;
	
	public void selectColor(){
		System.out.println("selectColor");
	}
	
	public String getColor() {//�Զ�����getter��setter��source
		return color;
	}
	public void setColor(String color) {
		this.color = color;//this�ؼ��֣�������ǰ���������
		this.selectColor();//this�ؼ��֣����õ�ǰ����ķ���
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

	//public String getColor(){//��װ:set��ֵ��getȡֵ�����ÿ���Ҫ
	//	return color;
	//}
	//public void setColor(String newColor){
	//	color = newColor;
	//}
    
}

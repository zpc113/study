package com.wj.study._20171227;

public class NewStudy {
	String color ;
	String size ;
	String style ;
    public NewStudy(){
    	System.out.println("�����޲εģ�");
    }
    public NewStudy(String color1 , String size1 , String style1){
    	if (color1 == "��ɫ"){//���ߵ�
    		color1 = "��ɫ";
    		System.out.println("û�а�ɫ���·��ˣ�");
    	} else {
    		System.out.println("��ϲ����������ϲ�����·���");
    	}
    	color = color1 ;
    	size = size1 ;
    	style = style1 ;
    	System.out.println("�����вεģ�");
    }
}

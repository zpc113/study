package com.wj.study._20171228;

public class Lei {//�ⲿ��
	//�ڲ���
	//public class Inner{//�ڲ���
	//	public void show(){//�ڲ���ķ���
	//		System.out.println("welcome to imooc!");
	//	}
	//}
	//public static void main(String[] args){
	//	Lei hi = new Lei();//�����ⲿ�����
	//	Inner i = hi.new Inner();//�����ڲ������
	//	i.show();//�����ڲ������ķ���
	//}
	
	//��Ա�ڲ���
	private String name = "imooc��";
	int age = 20;
	public class Inner{
		String name = "��Ľ�Σ�";
		public void show(){
			System.out.println("�ⲿ���е�name��" + Lei.this.name);
			System.out.println("�ڲ����е�name��" + name);
			System.out.println("�ⲿ���е�age��" + age);
		}
	}
	public static void main(String[] args){
		Lei hi = new Lei();
		Inner i = hi.new Inner();
		i.show();
	}

}

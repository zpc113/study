package com.wj.study._20171227;

public class Test {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		//NewStudy study = new NewStudy();
		//NewStudy study1 = new NewStudy("��ɫ","�к�","����");
	//}
	//static int score1 = 86;
	//static int score2 = 92;
	//public static int sum(){
	//	int sum = score1 + score2 ;
	//	return sum;
	//}
	//public static void main(String[] args){
	//	int allscore = sum();
	//	System.out.println("�ܷ֣�" + allscore);
	//}
     String name;
     String sex;
     static int age;
     public Test(){
    	 name = "tom";
    	 System.out.println("ͨ�����췽����ʼ��name");
     }
     {
    	 sex = "��";
    	 System.out.println("ͨ����ʼ�����ʼ��sex");
     }
     static {
    	 age = 20;
    	 System.out.println("ͨ����̬��ʼ�����ʼ��age");
     }
     public void show(){
    	 System.out.println("������" + name + "���Ա�" + sex + "�����䣺" + age);
     }
     public static void main(String[] args){
    	 Test zhixing = new Test();
    	 zhixing.show();
     }
}

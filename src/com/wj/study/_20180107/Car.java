package com.wj.study._20180107;

public class Car {
	int num;
	String name;
	int price;
	int driveType; // 0 : 人    1 : 货       2 : 人和货一起
	int sum1;//人数
	int sum2;//货重
	public Car(int num , String name , int price ,int driveType,int sum1,int sum2){
		this.num = num;
		this.name = name;
		this.price = price;
		this.driveType = driveType;
		this.sum1 = sum1;
		this.sum2 = sum2;
	}
	

}

package com.wj.study._20180107;

import java.util.Scanner;

public class Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("您好，欢迎使用答答租车系统！ \n您是否要租车?（1是，2否）");// \n换行，加在引号里面
		int sum = input.nextInt();
		if (sum == 1) {
			System.out.println("进入选车");
			System.out.println("***价目表***\n序号\t名称 \t价格\t载客/货");// \t拉开距离
			Car[] rent = { new Bus1(1, "法拉利", 1000000, 0, 3, 0), new Bus2(2, "兰博基尼", 200, 0, 4, 0),
					new Truck1(3, "拖拉机", 300, 1, 0, 3), new Truck2(4, "东风风神", 400, 1, 0, 5),
					new PickUp(5, "皮卡车", 500, 2, 2, 3) };
			// 可以用任何类型来定义
			// 用父类数组存储多个子类对象
			System.out.println("请输入您需要的车辆数目：");
			int i = input.nextInt();// i是车辆数目
			int n = 0;// 人数
			int m = 0;// 货重
			int p = 0;// 价格
			String t1 = ""; // 轿车
			String t2 = ""; // 货车
			String t3 = "";// 皮卡
			for (int j = 1; j <= i; j++) {
				System.out.println("请输入第" + j + "辆车的序号：");
				int a = input.nextInt();
				Car car = rent[a - 1];
				n = car.sum1 + n;
				m = car.sum2 + m;
				p = car.price + p;
				if (car.driveType == 0 && !t1.contains(car.name)) {
					t1 = t1 + " " + car.name;
				} else if (car.driveType == 1 && !t2.contains(car.name)) {
					t2 = t2 + " " + car.name;
				} else if (car.driveType == 2 && !t3.contains(car.name)) {
					t3 = t3 + " " + car.name;
				}
			}
			System.out.println("请输入租车天数：");
			int day = input.nextInt();
			p = p * day;
			System.out.println("您的账单如下：");
			System.out.println("***载人车辆为：" + t1 + " " + t3 + "共可载重" + n + "人");
			System.out.println("***载货车辆为：" + t2 + " " + t3 + "共可载重" + m + "吨");
			System.out.println("***租车的总价为：" + p + "元人民币。");
		} else {
			System.out.println("谢谢使用！退出系统！");
		}
	}


}

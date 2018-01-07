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
			Car[] rent = { new Bus1(1, "法拉利", 100, 0, 3, 0), new Bus2(2, "兰博基尼", 200, 0, 4, 0),
					new Truck1(3, "拖拉机", 300, 1, 0, 3), new Truck2(4, "东风风神", 400, 1, 0, 5),
					new PickUp(5, "皮卡车", 500, 2, 2, 3) };
			// 可以用任何类型来定义
			// 用父类数组存储多个子类对象
			System.out.println("请输入您需要的车辆数目：");
			int i = input.nextInt();// i是车辆数目
			int n = 0;// 人数
			int m = 0;// 货重
			int p = 0;// 价格
			String t1 = "";
			String t2 = "";
			String t3 = "";// 车辆名称
			for (int j = 1; j <= i; j++) {
				System.out.println("请输入第" + j + "辆车的序号：");
				int a = input.nextInt();
				n = rent[a - 1].sum1 + n;
				m = rent[a - 1].sum2 + m;
				p = rent[a - 1].price + p;
				if (rent[a - 1].driveType == 0) {
					if (!isContain(t1))
						t1 = t1 + " " + rent[a - 1].name;
				} else if (rent[a - 1].driveType == 1) {
					if (!isContain(t2))
						t2 = t2 + " " + rent[a - 1].name;
				} else {
					if (!isContain(t3))
						t3 = t3 + " " + rent[a - 1].name;
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

	public static boolean isContain(String str) {
		if (str.contains("法拉利") || str.contains("兰博基尼") || str.contains("拖拉机") || str.contains("东风风神")
				|| str.contains("皮卡车"))
			return true;
		return false;
	}

}

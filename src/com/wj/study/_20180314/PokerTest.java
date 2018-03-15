package com.wj.study._20180314;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class PokerTest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Poker> pokerList = new ArrayList<Poker>();
		String[] color = {"方片" , "梅花" , "红桃" , "黑桃"};
		String[] num = {"1" , "2" , "3" , "4" , "5" , "6" , "7" , "8" ,"9" , "10" , "J" , "Q" , "K" , "A"};
		for (int i = 0 ; i < color.length ; i ++){
			for (int j = 0 ; j < num.length ; j ++){
				Integer k = j *10 + i;
				Poker poker = new Poker( k , color[i] + num[j]);
				pokerList.add(poker);
			}
		}
		System.out.println("取出一副牌，牌如下");
		for (Poker poker1 : pokerList) {
			System.out.print(poker1.pok + ",");
		}
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("\n洗牌！");
		Collections.shuffle(pokerList);
		
		List<Poker> play1 = new ArrayList<Poker>();
		List<Poker> play2 = new ArrayList<Poker>();
		
		System.out.println("请输入第一位的ID");
		int ID1 = input.nextInt();
		System.out.println("请输入第一位玩家的名字");
		String name1 = input.next();
		System.out.println("欢迎玩家" + name1);
		System.out.println("请输入第二位的ID");
		int ID2 = input.nextInt();
		System.out.println("请输入第二位玩家的名字");
		String name2 = input.next();
		System.out.println("欢迎玩家" + name2);
		
		for (int i = 0 ; i < 4 ; i++){
			if (i % 2 == 0){
				play1.add(pokerList.get(i));
				System.out.println("玩家" + name1 + "拿牌！");
			} else {
				play2.add(pokerList.get(i));
				System.out.println("玩家" + name2 + "拿牌！");
			}
		}
		
		Collections.sort(play1);//升序排序
		Collections.sort(play2);
		System.out.println("玩家" + name1 + "最大手牌为：" + play1.get(1).pok);
		System.out.println("玩家" + name2 + "最大手牌为：" + play2.get(1).pok);
		if (play1.get(1).k > play2.get(1).k){
			System.out.println( name1 + "获胜");
		} else {
			System.out.println( name2 + "获胜");
		}
		
		for (Poker poker1 : play1) {
			System.out.println(name1 + poker1.pok);
		}
		for (Poker poker2 : play2) {
			System.out.println(name2 + poker2.pok);
		}
		

	}

}

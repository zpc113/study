package com.wj.study._20180308;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PokerTest {
	/**
	 * 创建一副扑克牌，包括四种花色：黑桃、红桃、梅花、方片,从大到小
	 * 十三种点数：2,3,4,5,6,7,8,9,10，j，q，k，a，不考虑大小王
	 * 创建两名玩家，玩家至少要有ID、姓名、手牌等属性，手牌为扑克牌的集合
	 * 洗牌：将之前创建的“一副扑克牌”打乱顺序
	 * 发牌：将洗牌之后的扑克牌集合，从第一张开始，发给两名玩家，按照一人一张的方式，每人发两张
	 * 游戏：比较两名玩家手中的扑克牌，规则为：取两人手中点数最大的牌进行比较，点数大的赢；若两人各自的点数
	 *       最大的牌相等，则再按花色比较。
	 * @param args
	 */
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Poker> pokerList = new ArrayList<Poker>();
		List<Poker> pokerList2 = new ArrayList<Poker>();
		List<Poker> play1 = new ArrayList<Poker>();
		List<Poker> play2 = new ArrayList<Poker>();
		//List<Poker> playGame = new ArrayList<Poker>();
		System.out.println("----------创建一副扑克牌：");
		String[] huaSe = {"方片" , "梅花" , "红桃" , "黑桃"};
		String[] dianShu = {"2" , "3" , "4" , "5" , "6" , "7" , "8" , "9" , "10" , "J" , "Q" , "K" , "A"};
	    
		for (int i = 0 ; i < huaSe.length ; i++){
			for (int j = 0 ; j < dianShu.length ; j++){
				pokerList.add(new Poker(huaSe[i] , dianShu[j]));
			}
		}
		System.out.println("该扑克牌有如下牌：" );
		for (Poker poker : pokerList) {
			System.out.print(poker.huaSe + poker.dianShu + ",");
		}
		
		System.out.println("\n开始洗牌------");
		Random random = new Random();
		Integer k;
		for (int i = 0 ; i < pokerList.size() ; i++){
			do {
				k = random.nextInt(pokerList.size() - 1);
				pokerList2.add(pokerList.get(k));
			} while (!pokerList2.contains(pokerList.get(k)));
			
		}
		System.out.println("洗牌结束！");
		
		System.out.println("创建玩家------");
		Scanner input = new Scanner(System.in);
		System.out.println("请输入第1位玩家的ID和姓名-------");
		System.out.println("请输入ID：");
		int ID1 = input.nextInt();
		System.out.println("请输入姓名:");
		String name1 = input.next();
		System.out.println("请输入第1位玩家的ID和姓名-------");
		System.out.println("请输入ID：");
		int ID2 = input.nextInt();
		System.out.println("请输入姓名:");
		String name2 = input.next();
		System.out.println("欢迎玩家：" + name1 + "\n欢迎玩家：" + name2);
		
		System.out.println("开始发牌...");
		for (int i = 0 ; i < 4 ; i++){
			if ( i % 2 == 0){
				play1.add(pokerList2.get(i));
				System.out.println( name1 + "---拿牌");
			} else {
				play2.add(pokerList2.get(i));
				System.out.println( name2 + "---拿牌");
			}
		}
		System.out.println("发牌结束！" + "\n开始游戏------");
		Collections.sort(play1);
		System.out.println( name1 + "最大的手牌为" + play1.get(1).huaSe + play1.get(1).dianShu);
		
		Collections.sort(play2);
		System.out.println( name2 + "最大的手牌为" + play2.get(1).huaSe + play2.get(1).dianShu);
		
		if (play1.get(1).dianShu.compareTo(play2.get(1).dianShu) > 0){
			System.out.println(name1 + "获胜！");
		} else if (play1.get(1).dianShu.compareTo(play2.get(1).dianShu) < 0){
			System.out.println(name2 + "获胜！");
		} else {
			if (play1.get(1).huaSe.compareTo(play2.get(1).huaSe) > 0)
			    System.out.println(name1 + "获胜！");
			if (play1.get(1).huaSe.compareTo(play2.get(1).huaSe) > 0)
				System.out.println(name1 + "获胜！");
		}
		
		
		System.out.println("玩家各自的手牌为：\n" + name1 + ":");
		for (Poker play11 : play1) {
			System.out.print(play11.huaSe + play11.dianShu + ",");
		}
		System.out.println( "\n" + name2 + ":");
		for (Poker play22 : play2) {
			System.out.print(play22.huaSe + play22.dianShu + ",");
		}
	}

}

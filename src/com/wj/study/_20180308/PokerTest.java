package com.wj.study._20180308;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import com.wj.study._20180117.Student;

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
	public static Map < String ,  Poker> pokers;
	
	public PokerTest(){
		this.pokers = new HashMap <String , Poker>();
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Poker> pokerList = new ArrayList<Poker>();
		String[] color = {"方片" , "梅花" , "红桃" , "黑桃"};
		String[] num = {"1" , "2" , "3" , "4" , "5" , "6" , "7" , "8" ,"9" , "10" , "J" , "Q" , "K" , "A"};
		for (int i = 0 ; i < 4 ; i ++){
			for (int j = 0 ; j < 13 ; j ++){
				Poker poker = new Poker(i , j);
				pokerList.add(poker);
			}
		}
		
//		String[] color = {"方片" , "梅花" , "红桃" , "黑桃"};
//		String[] num = {"1" , "2" , "3" , "4" , "5" , "6" , "7" , "8" ,"9" , "10" , "J" , "Q" , "K" , "A"};
//		
//		for (int i = 0 ; i < color.length ; i ++){
//			for (int j = 0 ; j < num.length ; j ++){
//				Poker poker = new Poker(i , j);
//				pokerList.add(poker);
//				String pok = color[i] + num[j];
//				System.out.println(poker.huaSe + "" + poker.dianShu);
//				System.out.println(pok);
//				pokers.put(pok, poker);
//			}
//		}
		
		
//		Set<String> KeySet = pokers.keySet();
//		for (String string : KeySet) {
//			System.out.println(string);
//		}
//		
//		System.out.println("开始洗牌。。。。。");
//		Collections.shuffle(pokerList);
//		List<Poker> pokerList2 = new ArrayList<Poker>();
//		Random random = new Random();
//		Integer k;
//		for (int i = 0 ; i < pokerList.size() ; i ++){
//			do {
//				k = random.nextInt(pokerList.size() - 1);
//				pokerList2.add(pokerList.get(k));
//			} while (!pokerList2.contains(pokerList.get(k)));
//		}
//		System.out.println("洗牌结束。。。。。");
		
		
		
//		System.out.println("创建玩家。。。。。");
//		Scanner input = new Scanner(System.in);
//		int ID = input.nextInt();
//		String name = input.next();
//		Player play = new Player(ID , name);


	}
	

}

package com.wj.study._20180101;

public class SmartPhone extends Phone implements IPlayGame {

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("具有打电话的功能。");
	}

	@Override
	public void sendMessage() {
		// TODO Auto-generated method stub
		System.out.println("具有发短信的功能。");
	}

	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		System.out.println("具有玩游戏的功能。");
	}

}

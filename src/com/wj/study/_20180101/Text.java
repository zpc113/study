package com.wj.study._20180101;

public class Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPlayGame i1 = new SmartPhone();//接SmartPhone
		i1.playGame();
		IPlayGame i2 = new Psp();//接Psp
		i2.playGame();
		//使用匿名内部类的方式实现接口
		IPlayGame i3 = new IPlayGame(){//方法1

			@Override
			public void playGame() {
				// TODO Auto-generated method stub
				System.out.println("使用匿名内部类的方式实现接口");
			}
			
		};
        i3.playGame();
        //方法2
        new IPlayGame(){
        	public void playGame() {
				// TODO Auto-generated method stub
				System.out.println("使用匿名内部类的方式实现接口。");
			}
        }.playGame();
	}

}

package com.wj.study._20180112;

import java.util.Scanner;

public class BookTest1 {

	static Book[] books = { new Book(1,"数学"),new Book(2,"语文"),new Book(3,"英语")};
	
	static BookTest1 a = new BookTest1();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("欢迎使用图书借书系统！");
		do {
			a.test4();
		} while (a.test4() == 0);
		
		

	}
	public void test1(int sum) throws InputException{
		if (sum != 1 && sum != 2){
			throw new InputException("命令输入错误！请根据提示输入数字命令！");
		}
	}
	public String test2(String name1) throws NothingException{//返回值
	    for (int i = 0 ; i <= books.length - 1;i++){
	        if (name1.contains(books[i].name))
	        	return books[i].name;
	    }
	    throw new NothingException("图书不存在！");
	}
	public String test3(int num1) throws NothingException{
	    if (num1 >= books.length - 1){
	        return books[num1 - 1].name;	
	    }
	        throw new NothingException("图书不存在！");
	}
	public static int test4(){
		try {
			Scanner input = new Scanner(System.in);
			System.out.println("输入命令：1——按照书名查找图书；2——按照序号查找图书");
			int sum = input.nextInt();
			a.test1(sum);
			if (sum == 1){
		        System.out.println("请输入图书名称：");
		        String name1 = input.next();
		        a.test2(name1);
		        System.out.println("这是您需要借的书：" + name1);
			} else {
				System.out.println("请输入图书序号：");
		        int num1 = input.nextInt();
		        a.test3(num1);
		        System.out.println("这是您需要借的书：" + books[num1 - 1].name);
			}
		}catch (InputException e){
			System.out.println(e.getMessage());
			return 0;
		}catch (NothingException e){
			System.out.println(e.getMessage());
			return 0;
		}catch (Exception e){
			System.out.println("命令输入错误！请根据提示输入数字命令！");
			return 0;
		}
		return 1;
	}

}

package com.wj.study._20180114;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadTest {
	
	public static String test = new String("test");
	static int i = 0;
	public static void main(String[] args) {
		
		
		ExecutorService ex = Executors.newFixedThreadPool(10);
		
		for(; i < 10 ; i++) {
			ex.execute(new Runnable() {
				@Override
				public void run() {

						System.out.println(test + i);

				}
			});
		}
		ex.shutdown();
		System.out.println(test);
	}
}

package com.concurrency;

public class Main {

	public static void main(String[] args) {
		Horse h1 = new Horse("Horse1");
		h1.start();
		Horse h2 = new Horse("Horse2");
		h2.start();
		
//		HorseRunnable h1 = new HorseRunnable();
//		Thread thread = new Thread(h1);
//		thread.start();

		System.out.println("main end");
		
	}

}

package com.concurrency;

public class HorseRunnable implements Runnable{
	public void run() {
		for (int i=1; i<=1000; i++) {
			System.out.println("Horse2:" + i);
		}
	}

}

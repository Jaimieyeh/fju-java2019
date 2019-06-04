package com.jy;

public class Wizard extends Thread{
	public void thunder() {
		synchronized (this) {
			System.out.println("thunder start");
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("thunder end");
		}
	}
	public void run() {
		thunder();
	}

}

package com.jy;

public class Tester {

	public static void main(String[] args) {
		
		Breakfast bf = new Breakfast();
		bf.start();
		
		BrushTeeth bt = new BrushTeeth();
		Thread thread = new Thread(bt);
		thread.start();
		try {
			thread.join();
			bf.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main end");
	}

}

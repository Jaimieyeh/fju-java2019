package com.jy;

public class BrushTeeth implements Runnable{
	@Override
	public void run() {
		try {
			System.out.println("brushing teeth");
			Thread.sleep(3000);
			System.out.println("brushed");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}

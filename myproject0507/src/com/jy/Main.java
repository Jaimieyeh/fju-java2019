package com.jy;

public class Main {

	public static void main(String[] args) {
		Wizard w1 = new Wizard();
		new Thread(w1).start();
		
		Wizard w2 = new Wizard();
		new Thread(w2).start();
		
		
	}

}

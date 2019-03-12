package com.lesson3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListWork {

	public static void main(String[] args) {
		Random random = new Random();
		List<Integer> l = new ArrayList<>();
//		for (int i=0; i<10000; i++) {
//			l.add(random.nextInt(20));
//		}
//		for (int i=0; i<l.size(); i++) {
//			System.out.println(l.get(i));
//		}		
		for (int i=0; i<20; i++) {
			l.add(0);
		}
		for(int i=0; i<10000; i++) {
			int r = random.nextInt(20);
			Integer freq = l.get(r);
			l.set(r, freq + 1);
		}
		
		System.out.println(l);
	}
}

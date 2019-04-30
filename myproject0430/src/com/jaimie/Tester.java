package com.jaimie;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		int bonus = 2000000;
		int result = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many people gets:");
		try {
			int number = scanner.nextInt();
			scanner.nextLine();
			result = bonus/number;
			System.out.println("Everyone gets:" + result);	
		} catch ( InputMismatchException e) {
			System.out.println("data type error");
		} catch ( ArithmeticException e) {
			System.out.println("enter data error");
		}
//		  catch ( Exception e) {
//			  System.out.println("data error");
//		  }
	

	}

}

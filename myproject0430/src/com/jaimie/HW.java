package com.jaimie;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Enter your English score:");
			int english = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Enter your math score:");
			int math = scanner.nextInt();
			scanner.nextLine();
			int average = (english+math)/2;
			System.out.print("Average:" + average);
		} catch ( InputMismatchException e) {
			System.out.print("Enter data error");
//			e.printStackTrace();
		}
	}

}

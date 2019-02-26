package com.jaimie.practice;

public class GoTicket {
	String name;
	int price = 700;
	int number;
	public GoTicket(String name, int number) {
		this.name = name;
		this.number = number;
	}
	public void print() {
		System.out.print(name + "\t" + price + number);
	}
}

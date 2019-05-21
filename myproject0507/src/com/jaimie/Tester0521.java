package com.jaimie;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Tester0521 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("data.txt");
			Reader in = new InputStreamReader(fis);
			try {
				int n = in.read();
				while (n != -1) {
					System.out.print((char)n);
					n = in.read();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
	}

}

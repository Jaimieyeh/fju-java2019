package com.jaimie;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Tester {

	public static void main(String[] args) {
		File dir = new File("C:\\AppServ");
		if (dir.exists() && dir.isDirectory()) {
			File[] files = dir.listFiles();
			for (File f : files) {
				if (f.isFile()) {
					System.out.println(f.getName());
				}
			}
			File dd = new File(dir, "aaaaa");
			System.out.println(dd.mkdirs());
			System.out.println(dd.delete());
		}
		/*try {
			FileReader fr = new FileReader("aa.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}*/
		
		/*File file = new File("aa.txt");
		System.out.println(file.exists());
		System.out.println(file.isDirectory());
		System.out.println(file.canExecute());
		System.out.println(file.length());
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath());*/

	}

}

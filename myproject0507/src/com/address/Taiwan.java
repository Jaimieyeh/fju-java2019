package com.address;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Taiwan {
	public static void main(String[] args) {
		List<City> cities = new ArrayList<>();
	try {
		
		BufferedReader in = new BufferedReader(new FileReader("data1.txt"));
		String line = in.readLine();
		City lastCity = new City("");
		while( line != null) {
			System.out.println(line);
			String [] tokens = line.split(",");
			if (!lastCity.name.equals(tokens[0])) {
				lastCity = new City(tokens[0]);
				cities.add(lastCity);
			}
			line = in.readLine();
			
		}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		
		} catch (IOException e) {
			e.printStackTrace();
		} 

	}

}

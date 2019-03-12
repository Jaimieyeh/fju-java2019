package com.leson2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise2 {

	public static void main(String[] args) {
		Set<Integer> studentID = new HashSet<Integer>();
		studentID.add(107111);
		studentID.add(107222);
		studentID.add(107111);
		System.out.println(studentID);
		//學生的ID不可重複
		
		List<String> movie = new ArrayList<>();
		movie.add("Divergent");
		movie.add("Mission Impossible");
		movie.add("Divergent");
		movie.add("Moana");
		System.out.print("觀看電影順序為" + movie);
		//觀看的電影可重複，且按照我所想要的順序播放
	}

}

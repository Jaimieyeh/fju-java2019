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
		//�ǥͪ�ID���i����
		
		List<String> movie = new ArrayList<>();
		movie.add("Divergent");
		movie.add("Mission Impossible");
		movie.add("Divergent");
		movie.add("Moana");
		System.out.print("�[�ݹq�v���Ǭ�" + movie);
		//�[�ݪ��q�v�i���ơA�B���ӧکҷQ�n�����Ǽ���
	}

}

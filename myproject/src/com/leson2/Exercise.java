package com.leson2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise {

	public static void main(String[] args) {
		List<Integer> bag = new ArrayList<>();
		bag.add(10);
		bag.add(15);
		bag.add(10);
		bag.add(4);
		System.out.print(bag);
		//���浲�G��[10, 15, 10, 4]
		
		
		Set<Integer> bag2 = new HashSet<Integer>();
		bag2.add(10);
		bag2.add(15);
		bag2.add(10);
		bag2.add(4);
		System.out.print(bag2);
		//���浲�G��[4, 10, 15]�A����ᵲ�G�u�|�X�{�@��10�A�i��Set���i���ơA�Ӷ��Ǥ]�|���
	}
}
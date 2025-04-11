package com.cts.learning.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Vector;

public class HashSetDemo {

	public static void main(String[] args) {
		/*
		 * stores the unique elements
		 * randomly stores elements
		 * intial capacity 16
		 * underlying datastructure --> HashMap
		 * only one null value it allows
		 * not follow any insertion order
		 * load factor is 0.75 (12) --> double 32
		 * Non-synchronized
		 * LinkedHashset-->LinkedHashMap
		 * TreeSet -->HashMap+LinkedHashMap (Binary search tree)
		 * 
		 */
		
	//HashSet<Integer> nums = new HashSet<>();
	//LinkedHashSet<Integer> nums = new LinkedHashSet<>();
    //LinkedHashSet<Integer> nums = new LinkedHashSet<>();
	TreeSet<Integer> nums = new TreeSet<>(Comparator.reverseOrder());
	Collections.synchronizedSet(nums);
	nums.add(10);
	nums.add(7);
	System.out.println(nums.add(7));
	nums.add(0);
	nums.add(1);
	nums.add(2);
	nums.add(3);
	nums.add(4);
	nums.add(5);
	nums.add(6);
	
	nums.add(8);
	nums.add(9);

	nums.add(11);
	nums.add(12);
	nums.add(13);
	nums.add(14);
	System.out.println(nums);
	

	}

}

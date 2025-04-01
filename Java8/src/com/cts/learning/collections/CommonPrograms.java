package com.cts.learning.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CommonPrograms {

	public static void main(String[] args) {
		/*
		 * reverse this array*
		 * 
		 */
		Integer[] nums = { 5, 9, 1, 2, 3 }; // 3 2 1 9 5
		// reverseArray(nums);
		reverseArray(nums);
	}

	public static void reverseArray(Integer[] nums) {
//		int arrLength = nums.length - 1;
//
//		for (int i = arrLength; i >= 0; i--) {
//			System.out.print(nums[i]);
//		}

		List<Integer> finalNums = Arrays.asList(nums);
		Collections.reverse(finalNums);
		System.out.println(finalNums);

	}
}

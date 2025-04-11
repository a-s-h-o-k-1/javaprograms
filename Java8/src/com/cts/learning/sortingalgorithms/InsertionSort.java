package com.cts.learning.sortingalgorithms;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        insertionSort(new int[]{14, 9, 15, 12, 6, 8, 13});
    }

    private static void insertionSort(int[] nums) {
        int length = nums.length;
        for (int i = 0; i <= length - 1; i++) {
            int j = i;
            while (j > 0 && nums[j - 1] > nums[j]) {
                int temp = nums[j - 1];
                nums[j - 1] = nums[j];
                nums[j] = temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}

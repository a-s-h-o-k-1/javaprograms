package com.cts.learning.sortingalgorithms;

public class MergeSort {
    public static void sort(int[] inputArray) {
        sort(inputArray, 0, inputArray.length - 1);
    }

    public static void sort(int[] inputArray, int start, int mid, int end) {

    }


    public static void sort(int[] inputArray, int start, int end) {

        if (end <= start) {
            return;
        }
        System.out.println("start pointer: " + start);
        System.out.println("end pointer: " + end);
        int mid = (start + end) / 2;
        System.out.println("mid pointer: " + mid);
        sort(inputArray, start, mid);
        sort(inputArray, mid + 1, end);

    }

}

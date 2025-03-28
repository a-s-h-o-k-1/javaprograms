package com.cts.learning.sortingalgorithms;

public class Main {
    public static void main(String[] args) {
        int[] inputArray = {9, 7, 3, 1, 6, 3, 2, 6, 8, 9, 2, 3, 0};
        MergeSort.sort(inputArray);

    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

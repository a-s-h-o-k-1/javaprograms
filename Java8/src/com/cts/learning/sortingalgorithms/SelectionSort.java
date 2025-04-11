package com.cts.learning.sortingalgorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] numarr = {13, 46, 9, 24, 52, 13, 20, 9};
        //selectionSort(numarr);
        findLeast(numarr);
    }

    private static void findLeast(int[] numbers) {
        int length = numbers.length;
        for(int i =0; i<= length-2; i++){
            int minIndex =i;
            for(int j =i; j<=length-1; j++){
                if(numbers[minIndex]<numbers[j]){
                    minIndex = j;
                }
            }
            //swapping two integers
            int temp = numbers[minIndex];
            numbers[minIndex] = numbers[i];
            numbers[i] = temp;
        }
        System.out.println(Arrays.toString(numbers));
    }


    private static void selectionSort(int[] numarr) {
        int n = numarr.length;
        for (int i = 0; i <= n - 2; i++) {
            int min = i;
            for (int j = i; j <= n - 1; j++) {
                if (numarr[j] < numarr[min]) {
                    min = j;
                }
            }
            int temp = numarr[min];
            numarr[min] = numarr[i];
            numarr[i] = temp;
        }
        System.out.println(Arrays.toString(numarr));
    }
}

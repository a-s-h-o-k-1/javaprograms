package com.cts.learning.sortingalgorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        bubbleSort(new int[]{20, 13, 7, 9, 52, 46, 24});

    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = n - 1; i >= 1; i--) {
                int didswap =0;
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    didswap++;
                }
            }
            if(didswap==0) break;

        }
        System.out.println(Arrays.toString(arr));
    }
}

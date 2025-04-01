package com.cts.learning.sortingalgorithms;

public class MergeSort {
    public static void sort(int[] inputArray) {
        sort(inputArray, 0, inputArray.length - 1);
    }

    public static void merge(int[] inputArray, int start, int mid, int end) {
        int[] tempArray = new int[end - start + 1];
        int leftSlot = start;
        int rightSlot = mid + 1;
        int k = 0;
        while (leftSlot <= mid && rightSlot <= end) {
            if (inputArray[leftSlot] < inputArray[rightSlot]) {
                tempArray[k] = inputArray[leftSlot];
                leftSlot = leftSlot + 1;
            } else {
                tempArray[k] = inputArray[rightSlot];
                rightSlot = rightSlot + 1;
            }
            k = k + 1;
        }
        if (leftSlot <= mid) {
            while (leftSlot <= mid) {
                tempArray[k] = inputArray[leftSlot];
                leftSlot = leftSlot + 1;
                k = k + 1;
            }
        } else if (rightSlot <= end) {
            while (rightSlot <= end) {
                tempArray[k] = inputArray[rightSlot];
                rightSlot = rightSlot + 1;
                k = k + 1;
            }
        }

        for (int i = 0; i < tempArray.length; i++) {
            inputArray[start+i]=tempArray[i];

        }

    }


    public static void sort(int[] inputArray, int start, int end) {

        if (end <= start) {
            return;
        }
        // System.out.println("start pointer: " + start);
        //System.out.println("end pointer: " + end);
        int mid = (start + end) / 2;
        //System.out.println("mid pointer: " + mid);
        sort(inputArray, start, mid);
        sort(inputArray, mid + 1, end);
        merge(inputArray, start, mid, end);

    }


}

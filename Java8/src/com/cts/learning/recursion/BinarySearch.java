package com.cts.learning.recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 66, 77};
        int target = 4;
        int indexValue = search(arr, 0, arr.length - 1, target);
        System.out.println("index of the " + target + " : " + indexValue);
    }

    public static int search(int[] arr, int start, int end, int target) {

        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (target > arr[mid]) {
            return search(arr, start, mid - 1, target);
        }
        return search(arr, mid + 1, end, target);

    }
}

package com.cts.learning.programs;

import java.util.*;

public class ArraysInterviewQuestions {
    public static void main(String[] args) {
        int[] first = {4, 5, 7, 11, 9, 13, 8, 12};
        int[] firstwithDuplicates = {4, 5, 7, 11, 9, 13, 8, 12, 7, 13, 9, 11};
        int[] second = {1, 3, 2, 4};

        int[] numbers = new int[]{4, 6, 5, -10, 8, 5, 20};
        int target = 20;
        // System.out.println("both arrays are equal or not: " + checkTwoArrays(first, second));
        //System.out.println("both shuffle arrays are equal or not: " + checkTwoshuffleArrays(first, second));
        //  pairOfTwoArraysUsingLogOfN(first, 20);
        pairOfTwoArraysWithDuplicates(firstwithDuplicates, 20);
        //subArrays(second);
        //subArraysWithNumber(second, 9);
        //subArraysWithMaxSum(second, 3);
        //secondLargestNumber(firstwithDuplicates);
       // sumisEqualToGivenNumberWithDuplicates(firstwithDuplicates, target);

    }

    public static void sumisEqualToGivenNumberWithDuplicates(int[] arr, int target) {
        HashMap<Integer, Integer> numbers = new HashMap();
        for (int num : arr) {
            int paired = target - num;
            if (numbers.getOrDefault(paired, 0) > 0) {
                System.out.println("(" + paired + "," + num + ")");
                numbers.put(paired, numbers.get(paired) - 1);
            } else {
                numbers.put(num, numbers.getOrDefault(num, 0) + 1);
            }

        }
    }

    public static void secondLargestNumber(int[] arr) {
        /* using arrays*/
        int first = arr[0];
        int second = arr[1];
        if (first < second) {
            first = arr[1];
            second = arr[0];
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > first) {
                first = arr[i];
            } else if (arr[i] < first && arr[i] > second) {
                second = arr[i];
            }
        }
        System.out.println("first biggest num is " + first);
        System.out.println("second biggest num is " + second);
        /*using streams
         */
        int result = Arrays.stream(arr).boxed().distinct().sorted((a, b) -> b - a).skip(1).findFirst().get();
        System.out.println("second biggest num using streams: " + result);

    }

    public static void subArraysWithMaxSum(int[] arr, int size) {
        int maxSum = 0;
        if (arr.length < size) {
            System.out.println("not possible to sum");
        } else {
            int length = arr.length;
            for (int i = 0; i <= length - size; i++) {
                int currentSum = 0;
                for (int j = i; j < i + size; j++) {
                    currentSum = currentSum + arr[i];
                }
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("maxSum of " + size + " subarray: " + maxSum);

    }

    public static void subArraysWithNumber(int[] arr, int target) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                    if (sum == target) {
                        for (int l = i; l <= j; l++) {
                            System.out.print(arr[l] + " ");
                        }
                        System.out.println();
                    }
                }
            }
        }
    }

    /*
    subArrays
     */
    public static void subArrays(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            String subarray = "";
            for (int j = i; j < len; j++) {
//                for (int k = i; k <= j; k++) {
//                    System.out.print(arr[k] + " ");
//                }
                subarray = subarray + arr[j] + " ";
                System.out.println(subarray);
            }
        }
    }

    /*
    check two arrays or equal or not
     */
    public static boolean checkTwoArrays(int[] first, int[] second) {
        return Arrays.equals(first, second);
    }

    public static boolean checkTwoshuffleArrays(int[] first, int[] second) {
        Arrays.sort(first);
        Arrays.sort(second);
        return Arrays.equals(first, second);

    }

    /*
    pair of two integers
     */
    public static void pairOfTwoArraysUsingLogOfN(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            int complementary = target - num;
            if (set.contains(complementary)) {
                System.out.println("(" + complementary + "," + num + ")");
            }
            set.add(num);
        }
    }

    /*
    pair of two integers
     */
    public static void pairOfTwoArraysWithDuplicates(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("(" + arr[i] + "," + arr[j] + ")");
                }
            }
        }
    }

}

package com.cts.learning.programs;

import java.util.*;
import java.util.stream.Collectors;

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
        // pairOfTwoArraysWithDuplicates(firstwithDuplicates, 20);
        //subArrays(second);
        //subArraysWithNumber(second, 9);
        //subArraysWithMaxSum(second, 3);
        //secondLargestNumber(firstwithDuplicates);
        // sumisEqualToGivenNumberWithDuplicates(firstwithDuplicates, target);
        //absoluteDifference(new int[]{5,-3,7,-2});
        //sortedBasedOntheElements(new int[]{7, 1, 3, 4, 7, 1, 7, 1, 4, 5, 1, 9, 3});
        //removeDuplicatesFromArrayWithoutCollectionApi(new int[]{4, 3, 2, 4, 9, 2});
        mergeTwoSortedArrays(new int[]{-7, 12, 17, 29, 41, 41, 56, 79,}, new int[]{-9, -3, 0, 5, 19, 19});

    }

    private static void mergeTwoSortedArrays(int[] arrayA, int[] arrayB) {
        int firstArrayLength = arrayA.length;
        int secondArrayLength = arrayB.length;
        int[] mergeArray = new int[firstArrayLength + secondArrayLength];
        int i = 0, j = 0, k = 0;
        while (i < firstArrayLength && j < secondArrayLength) {
            if (arrayA[i] < arrayB[j]) {
                mergeArray[k] = arrayA[i];
                k++;
                i++;
            } else {
                mergeArray[k] = arrayB[j];
                k++;
                j++;
            }
        }
        while (i < firstArrayLength) {
            mergeArray[k] = arrayA[i];
            k++;
            i++;
        }
        while (j< secondArrayLength) {
            mergeArray[k] = arrayB[j];
            k++;
            j++;
        }
        System.out.println("merged Array: "+Arrays.toString(mergeArray));
    }

    private static void removeDuplicatesFromArrayWithoutCollectionApi(int[] arrayWithDuplicates) {
        int uniqueNumberLength = arrayWithDuplicates.length;
        for (int i = 0; i < uniqueNumberLength; i++) {
            for (int j = i + 1; j < uniqueNumberLength; j++) {
                if (arrayWithDuplicates[i] == arrayWithDuplicates[j]) {
                    arrayWithDuplicates[j] = arrayWithDuplicates[uniqueNumberLength - 1];
                    uniqueNumberLength--;
                    j--;
                }
            }
        }
        int[] result = Arrays.copyOf(arrayWithDuplicates, uniqueNumberLength);
        System.out.println(Arrays.toString(result));

    }

    private static void sortedBasedOntheElements(int[] nums) {
        ArrayList<Integer> fresult = new ArrayList<>();
        Map<Integer, Long> result = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        result.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .forEach(entry -> {
                    for (int i = 1; i <= entry.getValue(); i++) {
                        fresult.add(entry.getKey());
                    }
                });
        System.out.println(fresult);
    }

    private static void absoluteDifference(int[] arr) {

        int length = arr.length;
        int min = Integer.MAX_VALUE;
        int firstElement = arr[0];
        int secondElement = arr[1];
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                int absolute = Math.abs(arr[i] - arr[j]);
                if (absolute < min) {
                    min = absolute;
                    firstElement = arr[i];
                    secondElement = arr[j];
                }
            }
        }
        System.out.println("min absolute pair: " + firstElement + secondElement);
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

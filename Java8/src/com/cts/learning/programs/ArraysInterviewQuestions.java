package com.cts.learning.programs;

import java.util.Arrays;

public class ArraysInterviewQuestions {
    public static void main(String[] args) {
        int[] first = {1, 2, 3, 4};
        int[] second = {1, 3, 2, 4};
        System.out.println("both arrays are equal or not: " + checkTwoArrays(first, second));
        System.out.println("both shuffle arrays are equal or not: " + checkTwoshuffleArrays(first, second));
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
}

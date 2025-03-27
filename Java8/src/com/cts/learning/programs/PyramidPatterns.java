package com.cts.learning.programs;

public class PyramidPatterns {
    public static void main(String[] args) {
        //pattern1(9);
        //pattern2(9);
        pattern3(9);
    }

    public static void pattern1(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int num) {
        int rowCount = 1;
        for (int i = num; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= rowCount; j++) {
                System.out.print(rowCount + " ");
            }
            System.out.println();
            rowCount++;
        }
    }

    public static void pattern3(int num) {

        int rowNumber = 1;
        for (int i = num; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= rowNumber; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
            rowNumber++;

        }
    }
}

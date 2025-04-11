package com.cts.learning.recursion;

public class PrintBoth {
    public static void main(String[] args) {
        printBoth(5);
    }

    public static void printBoth(int num) {
        if (num == 0) {
            return ;
        }
        System.out.println(num);
        printBoth(num - 1);
        System.out.println(num);
    }
}

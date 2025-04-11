package com.cts.learning.recursion;

public class FibonaaciSeries {
    public static void main(String[] args) {
        int num =6;
        System.out.println("fibonanci of "+num+" is :"+ fibonaci(num));
    }

    public static int fibonaci(int number) {
        if (number < 2) {
            return number;
        }

        return fibonaci(number - 1) + fibonaci(number - 2);
    }
}

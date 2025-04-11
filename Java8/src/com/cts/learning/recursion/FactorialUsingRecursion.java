package com.cts.learning.recursion;

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        //System.out.println(factorial(5));
        //System.out.println(sumOfFirstN(10));
        // System.out.println("sum of the digits:" + sumOftheDigits(7845));
        //System.out.println("sum of the digits:" + sumOftheDigits(7845));

    }

    static int sum =0;
    private static void  reverse(int num){
        if(num ==0){
            return;
        }

    }
    private static int multiplication(int num) {
        if (num % 10 == num) {
            return num;
        }

        return num % 10 * multiplication(num / 10);
    }

    private static int sumOftheDigits(int num) {
        if (num % 10 == num) return num;
        int result = num % 10 + sumOftheDigits(num / 10);
        return result;
    }

    private static int factorial(int num) {
        if (num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    private static int sumOfFirstN(int num) {
        if (num == 1) {
            return 1;
        }
        return num + sumOfFirstN(num - 1);
    }
}

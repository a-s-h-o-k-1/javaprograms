package com.cts.learning.recursion;

public class RecursionDemo {

    public static void main(String[] args) {
        print(1);
    }

    private static void print(int i) {
        if (i == 5) {
            System.out.println(i);
            return;
        }
        System.out.println(i);
        //this is last function call,
        //this is called tail recursion
        print(i + 1);
    }
}

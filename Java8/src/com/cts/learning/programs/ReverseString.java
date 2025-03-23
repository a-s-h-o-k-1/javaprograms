package com.cts.learning.programs;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(recursiveStringReverse("afzal"));
        stringReversalUsingCharArray("ashok kumar");
        stringReversalUsingCharArray("vinay");

    }


    public static String recursiveStringReverse(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        return recursiveStringReverse(str.substring(1)) + str.charAt(0);

    }

    public static void stringReversalUsingCharArray(String name) {
        char[] finalName = name.toCharArray();
        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(finalName[i]);
        }
        System.out.println();
    }

    public static void stringReversalUsingStringBuffer(String name) {
        System.out.println(new StringBuffer(name).reverse().toString());
    }
}

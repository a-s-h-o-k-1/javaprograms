package com.cts.learning.programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringInterviewQuestions {
    public static void main(String[] args) {
//        System.out.println(recursiveStringReverse("afzal"));
//        stringReversalUsingCharArray("ashok kumar");
//        stringReversalUsingCharArray("vinay");
//        RemoveWhiteSpaces("ashok kumar         0511");
//        frequencyOfCharacter("ashokkumar");
//        System.out.println("both are anagrams: " + checkAnagrams("ashok Kumar", "Ashok"));
        duplicateCharacters("ashokkumar");
    }

    /*
    find duplicate character in a string
     */
    public static void duplicateCharacters(String str) {
        HashSet<String> duplicateCharacter = new HashSet<>();
//        for (String i : str.split("")) {
//            if (!duplicateCharacter.add(i)) {
//                System.out.println("duplicate characters are :" + i);
//            }
//        }
        /*
        using streams
         */
        Arrays.stream(str.split("")).filter(ch -> !duplicateCharacter.add(ch)).forEach(System.out::println);
    }

    /*
    check both strings are anagrams
     */
    public static boolean checkAnagrams(String str1, String str2) {
        String first = str1.toLowerCase().replaceAll("\\s", "");
        String second = str2.toLowerCase().replaceAll("\\s", "");
        return Arrays.equals(first.toCharArray(), second.toCharArray());

    }


    /*Frequency of a Character in a String
     */
    public static void frequencyOfCharacter(String str) {
        Map<String, Long> result = Arrays.stream(str.split("")).collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        result.forEach((character, count) -> System.out.println(character + " : " + count));


    }


    /*RemoveWhiteSpaces in a string
     */
    public static void RemoveWhiteSpaces(String str) {
        System.out.println("BeforeReplacing: " + str);
        String result = str.replaceAll("\\s+", "-");
        System.out.println("After replacing: " + result);
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

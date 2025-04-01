package com.cts.learning.programs;

import java.util.*;
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
//        duplicateCharacters("ashokkumar");
//        binaryOrnot(1010);
//        reverseEachWordInString("ashok kumar battala");
//        reverseEachWordInStringUsingStream("ashok kumar battala");
//        fillZerosAtEnd(new int[]{12, 0, 7, 0, 8, 0, 3});
//        fillZerosAtStart(new int[]{12, 0, 7, 0, 8, 0, 3});
//      findLeaders(new int[]{12, 9, 7, 14, 8, 6, 3});
//        int input = 7325;
//        reveseAndAdd(input);
//        String input = "ashok is a good boy";
//        reverseStringWithPreserved(input);
//        String romanToInteger = "MCMXCIV";
//        romanToIntegerConversion(romanToInteger);
        Runtime runtime = Runtime.getRuntime();
        try {
            runtime.exec("C:\\Users\\2076320\\eclipse\\jee-2023-064\\eclipse\\eclipse.exe");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void romanToIntegerConversion(String input) {
        HashMap<Character, Integer> data = new HashMap<>();
        data.put('I', 1);
        data.put('V', 5);
        data.put('X', 10);
        data.put('L', 50);
        data.put('C', 100);
        data.put('D', 500);
        data.put('M', 1000);
        int result = data.get(input.charAt(input.length() - 1));
        for (int i = input.length() - 2; i >= 0; i--) {
            if (data.get(input.charAt(i)) >= data.get(input.charAt(i + 1))) {
                result = result + data.get(input.charAt(i));
            } else {
                result = result - data.get(input.charAt(i));
            }
        }
        System.out.println("result of the roman: " + result);
    }

    public static void reverseStringWithPreserved(String input) {
        List<Integer> zeroIndexes = new ArrayList<>();
        String[] finput = input.split("");
        String[] flinput = input.split("\\s");
        for (int i = 0; i < finput.length; i++) {
            if (finput[i].equals(" ")) {
                zeroIndexes.add(i);
            }
        }
        String strWithOutSpaces = Arrays.stream(flinput).map(str -> new StringBuffer(str)).collect(Collectors.joining(""));
        StringBuffer sb = new StringBuffer(strWithOutSpaces).reverse();
        for (int i : zeroIndexes) {
            sb.insert(i, " ");
        }
        System.out.println("after reversing the string: " + sb.toString());
    }

    /*
    palindrome
     */
    public static void reveseAndAdd(int number) {

        if (isPalindrome(number)) {
            System.out.println(number + " is palindrome");
        } else {

            while (!isPalindrome(number)) {
                int sum = reverse(number) + number;
                number = sum;
            }
            if (isPalindrome(number)) {
                System.out.println("palindrome number =" + number);
            }
        }

    }

    public static boolean isPalindrome(int number) {
        int reverse = reverse(number);
        if (number == reverse) {
            return true;
        }
        return false;

    }

    public static int reverse(int number) {
        int result = 0;
        while (number != 0) {
            int rem = number % 10;
            result = result * 10 + rem;
            number = number / 10;
        }
        return result;
    }

    public static void findLeaders(int[] arr) {
        List<Integer> numbers = new ArrayList<>();
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            if (length == (i + 1)) {
                numbers.add(arr[i]);
                break;
            }
            if (arr[i] > arr[i + 1]) {
                numbers.add(arr[i]);
            }
        }

        System.out.println("leaders in a array: " + Arrays.toString(numbers.toArray()));
    }


    /*
    fill zeros at the end
     */
    public static void fillZerosAtEnd(int[] arr) {
        int[] newArray = new int[arr.length];
        int nonZeroCount = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                nonZeroCount++;
                newArray[nonZeroCount] = arr[i];
            }
        }
        System.out.println(Arrays.toString(newArray));
    }

    /*
    At the start
     */
    public static void fillZerosAtStart(int[] arr) {
        int[] newArray = new int[arr.length];
        int zeroCount = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroCount++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                zeroCount++;
                newArray[zeroCount] = arr[i];
            }
        }
        System.out.println(Arrays.toString(newArray));
    }

    /*
    reverseEachWordInString using streams
     */
    public static void reverseEachWordInStringUsingStream(String name) {
        String result = Arrays.stream(name.split("\\s")).map(in -> new StringBuffer(in).reverse()).collect(Collectors.joining(" "));
        System.out.println(result);
    }

    public static void reverseEachWordInString(String name) {
        String[] nameArray = name.split("\\s");
        String[] result = new String[nameArray.length];
        int index = -1;
        for (String str : nameArray) {
            index++;
            char[] charArray = str.toCharArray();
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = charArray.length - 1; i >= 0; i--) {
                stringBuffer.append(charArray[i]);
            }
            result[index] = stringBuffer.toString();
        }
        String fresult = String.join(" ", result);
        System.out.println(fresult);
    }


    /*
    binary or not
     */
    public static void binaryOrnot(int number) {
        String upnumber = String.valueOf(number);
        if (upnumber.matches("[01]+")) {
            System.out.println(number + " is binary");
        } else {
            System.out.println(number + " is not a binary");
        }
    }

    public static void binaryOrnotUsingString(int number) {
        String upnumber = String.valueOf(number);
        if (!(upnumber.contains("1") || upnumber.contains("0"))) {
            System.out.println(number + " is not a binary");
        } else {
            System.out.println(number + " is not a binary");
        }
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

package com.cts.learning;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Collections.swap(numbers, 1, 3);
        System.out.println(numbers); // Output: [1, 4, 3, 2, 5]
    }


}

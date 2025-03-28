package com.cts.learning.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<>();
        friends.add("anjali");
        friends.add("ashok");
        friends.add("supriya");
        friends.add("vinay");
        friends.add("bhagya");
        friends.add("ashok");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(1);
        nums1.add(2);
        nums1.add(-3);
        nums1.add(4);
        nums1.add(0);
        /*
        sorting
         */
        System.out.println("Before sorting: " + friends);
        Collections.sort(friends);
        System.out.println("After sorting in ascending order: " + friends);
        Collections.sort(friends, Collections.reverseOrder());
        System.out.println("After sorting in descending order: " + friends);

        /*
        searching
         */
        int index = Collections.binarySearch(nums, 3);
        System.out.println("found in index: " + index);

        /*
        only read access
         */
        // List<String> unmodlist = Collections.unmodifiableList(friends);
        // unmodlist.add("bhagya");
        /*
        shuffle the data
         */
//        Collections.shuffle(nums);
//        System.out.println("after shuffling: " + nums);

        /*
        swap the numbers
         */
        System.out.println("Before swap: " + nums);
        Collections.swap(nums, 2, 4);
        System.out.println("after swap: " + nums);


        /*
        fill the collection
         */
        System.out.println("Before ]filling: " + friends);
        Collections.fill(friends, "ashok");
        System.out.println("after filling: " + friends);

        /*
        count of data
         */
        int count = Collections.frequency(friends, "ashok");
        System.out.println("count: " + count);

        /*
        max and min
         */
        System.out.println("max number in collection: " + Collections.max(nums));
        System.out.println("max number in collection: " + Collections.min(nums));

        /*
        disjoint
         */

        System.out.println(Collections.disjoint(nums, nums1));

        /* mostly used common collections are
        /*
        internally using arrays datastructure (dynamic array)
        intial capacity =10;'
        allows duplicate elements
        allows null values
        maintains insertion order
        -->fast for retreiving the data by using index(arrays follows the indexing)
        --> capacity reaches to 100% it grows to 50%
        -->15
        50%
        -->22
         */

//       int[] numbers = new int[4];
//      numbers[4] = 7;

    }
}

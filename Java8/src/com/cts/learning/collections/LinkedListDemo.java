package com.cts.learning.collections;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> friends = new LinkedList<>();
		friends.add("anjali");
		friends.add("ashok");
		friends.add("supriya");
		friends.add("vinay");
		friends.add("bhagya");
		friends.add("ashok");
		Collections.synchronizedList(friends);
		//thread safe
		
		 /* mostly used common collections are
        /*
        internally using doubleLinkedList 
        allows duplicate elements
        allows null values
        maintains insertion order
        -->data manipulation (insertion, deletion, updation)
        -->not synchorinzed(good performence, but less accuracy)l-->data inconsistency
        -->synchornization(good accuracy, performance is low, if two tasks are running concurrently/simutaneosuly, it will work with one by one )
        (data consistency)
         */

	}

}

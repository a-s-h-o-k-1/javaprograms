package com.cts.learning.collections;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> friends = new Stack<>();
		// LIFO
		friends.push("anjali");
		friends.push("ashok");

		System.out.println("last element: " + friends.peek());
		friends.pop();
		System.out.println("last element: " + friends.peek());
		System.out.println("which index it is present: " + friends.search("anjali"));

		/* mostly used common collections are
        /*
        internally using arrays 
        default -->10
        intial -->10
        allows duplicate elements
        allows null values
        maintains insertion order
        -->LIFO 
        -->threadSafe
        -->synchornization(good accuracy, performance is low, if two tasks are running concurrently/simutaneosuly, it will work with one by one)
         */
	}

}

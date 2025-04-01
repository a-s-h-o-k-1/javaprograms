package com.cts.learning.collections;

import java.util.LinkedList;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		//old one
		Vector<String> friends = new Vector<>();
		friends.add("anjali");
		friends.add("ashok");
		friends.add("supriya");
		friends.add("vinay");
		friends.add("bhagya");
		friends.add("ashok");
		friends.add("anjali");
		friends.add("ashok");
		friends.add("supriya");
		friends.add("vinay");
		friends.add("bhagya");
		friends.add("ashok");
		friends.add("anjali");
		friends.add("ashok");
		friends.add("supriya");
		friends.add("vinay");
		friends.add("bhagya");
		friends.add("ashok");
		
		 /* mostly used common collections are
        /*
        internally using arrays 
        default -->10
        intial -->10
        allows duplicate elements
        allows null values
        maintains insertion order
        -->store the data exponentially (100%)
        -->threadSafe
        -->synchornization(good accuracy, performance is low, if two tasks are running concurrently/simutaneosuly, it will work with one by one)
         */
	}
}

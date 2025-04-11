package com.cts.learning.sortingalgorithms;

public class Swapping {

	public static void main(String[] args) {
		int a = 10, b = 5;
		//swapping(a, b);
		swapping("ashok","battala");

	}

	private static void swapping(String first , String last ) {
//		String temp = first ;
//		first = last;
//		last = temp;
		//without third variable
		
		first = first +last ; //ashokbattala(12)
		last = first.substring(0, first.length()-last.length());//(0, 12-7) (0,5)//ashok
		first = first.substring(last.length());//(5)-->entire
		System.out.println(first+ " : "+ last);
		
	}

	private static void swapping(int a, int b) {
		// using third variable
//		int temp = a;
//		a = b;
//		b = temp;
//		System.out.println(a + " : " + b);

		a = a + b; // 15
		b = a - b; // 15-5    (10)
		a = a - b; // (15-10) (5)
		System.out.println("without using third variable: a:" + a + " b:" + b);

	}

}

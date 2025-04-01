package com.cts.learning.recursion;

public class RecursionDemo {

	public static void main(String[] args) {
	//	print(1);
		printRev(5);
	}

	public static void printRev(int i) {
		if (i == 0) {
			return;
		}
		printRev(i - 1);
		System.out.println(i - 1);
	}

	private static void print(int i) {
		if (i == 5) {
			System.out.println(i);
			return;
		}
		System.out.println(i);
		// this is last function call,
		// this is called tail recursion
		print(i + 1);
	}
}

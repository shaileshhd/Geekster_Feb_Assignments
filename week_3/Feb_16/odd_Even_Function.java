package com.Feb_16;

import java.util.*;

public class odd_Even_Function {
	public static void odd_Even(int num) {
		if (num % 2 == 0) {
			System.out.print("number is even");
		} else {
			System.out.print("number is odd");
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		odd_Even(num);
	}
}

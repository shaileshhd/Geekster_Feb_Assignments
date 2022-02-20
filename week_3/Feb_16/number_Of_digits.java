package com.Feb_16;

import java.util.*;

public class number_Of_digits {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = s.nextInt();
		int count = 0;
		while (num > 0) {
			count++;
			num /= 10;
		}
		System.out.print("Number of digits in the given num is: " + count);
		s.close();
	}
}

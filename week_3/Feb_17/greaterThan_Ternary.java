package com.Feb_17;

import java.util.*;

public class greaterThan_Ternary {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the num : ");
		int n = s.nextInt();
		String comment = n > 10 ? "Greater than 10" : n > 5 ? "Greater than 5" : "Less than 5";
		System.out.print(comment);
	}
}

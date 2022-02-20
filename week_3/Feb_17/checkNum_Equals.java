package com.Feb_17;

import java.util.*;

public class checkNum_Equals {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = s.nextInt();
		String result = (n <= 50 && n>0 && n % 10 == 0) ? "Belongs to the group" : "Doesn't belong to the group";
		System.out.print(result); // [10, 20, 30, 40, 50]
		s.close();
	}
}

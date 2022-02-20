package com.Feb_15;

import java.util.*;

public class sumOF_ASCII {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter any three characters: ");
		char c = s.next().charAt(0);
		char d = s.next().charAt(0);
		char e = s.next().charAt(0);
		int sumOf_ASCII = c + d + e;
		System.out.print(sumOf_ASCII);
		s.close();
	}
}

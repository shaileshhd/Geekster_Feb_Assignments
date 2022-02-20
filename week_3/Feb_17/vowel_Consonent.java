package com.Feb_17;

import java.util.*;

public class vowel_Consonent {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char c = s.next().charAt(0);
		String vowels = "aeiouAEIOU";
		int count = 0;
		String result = "";
		for(short i = 0; i < vowels.length(); i++) {
			count = (c == vowels.charAt(i)) ? 1 : count;
		}
		result = (count > 0) ? "is Vowel" : "is not vowel";
		System.out.print(result);
	}
}

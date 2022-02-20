package com.Feb_15;

import java.util.*;

public class reverse_String {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter name of the city : ");
		String str = s.next();
		String resultStr = "";
		for (short i = (short) (str.length() - 1); i >= 0; i--) {
			resultStr += str.charAt(i);
		}
		System.out.print(resultStr);
		s.close();
	}
}

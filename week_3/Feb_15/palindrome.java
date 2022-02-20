package com.Feb_15;
import java.util.*;

public class palindrome {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		String reverse = "";
		boolean status = true;
		for(short i = (short)(str.length() - 1); i >= 0; i--) {
			reverse += str.charAt(i);
		}
		for(short i = 0; i < str.length(); i++) {
			if(str.charAt(i) != reverse.charAt(i)) {
				status = false;
				System.out.print("not a palindrome");
				break;
			}
		}
		if(status) {
			System.out.print("is palindrome");
		}
	}
}

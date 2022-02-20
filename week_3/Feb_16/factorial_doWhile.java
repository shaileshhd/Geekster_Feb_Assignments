package com.Feb_16;

import java.util.*;

public class factorial_doWhile {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int factorial = 1;
		do {
			factorial *= num;
			num--;
		} while (num > 0);
		System.out.println(factorial);

		System.out.println("Do you wanna Continue (Y/N)");
		char c = s.next().charAt(0);
		if (c == 'Y' || c == 'y') {
			main(null);
		}
	}
}

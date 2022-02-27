package week4.Feb_21;

//Check if the number is divisible by 2 and 8 but not 12

import java.util.*;

public class numDivBy2_8_Not12 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = s.nextInt();
		if (n % 2 == 0 && n % 8 == 0 && n % 12 != 0) {
			System.out.print("divisible by 2 and 8 but not 12");
		} else {
			System.out.print("statement not satisfied");
		}
	}
}

//OUTPUT
/*
	Enter a number: 8
	divisible by 2 and 8 but not 12
	
	Enter a number: 12
	statement not satisfied
	
	Enter a number: 16
	divisible by 2 and 8 but not 12
	
	Enter a number: 24
	statement not satisfied
*/
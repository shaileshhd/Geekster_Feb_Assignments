package week4.Feb_22;

//Calculate number of digits in a anumber entered by the user.

import java.util.*;

public class numberOfDigits {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = s.nextInt();
		int count = 0;
		while (n > 0) {
			n /= 10;
			count++;
		}
		System.out.println("Number of digits: " + count);
	}
}

//OUTPUT
/*
	Enter a number: 5
	Number of digits: 1
	
	Enter a number: 12
	Number of digits: 2
	
	Enter a number: 65
	Number of digits: 3
	
	Enter a number: 6548
	Number of digits: 4
	
	Enter a number: 45698
	Number of digits: 5
*/
package week4.Feb_22;

//Create a function that check if num is odd or even. call this fucntion from main method

import java.util.*;

public class evenOrOddFucntion {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		evenOdd(n);
		s.close();
	}

	public static void evenOdd(int n) {
		String result = "";
		if (n % 2 == 0) {
			result = "EVEN";
		} else {
			result = "ODD";
		}
		System.out.println(result);
	}
}

//OUTPUT
/*
	2
	EVEN
	
	3
	ODD
	
	1001
	ODD
	
	1024
	EVEN
*/

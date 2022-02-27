package week4.Feb_21;

//Find if a given number is power of 2, Explore on logarithm function

import java.util.*;

public class check_IfPowOf2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = s.nextInt();
		double log = Math.log(n) / Math.log(2);

		System.out.println("Is power of 2: " + (Math.floor(log) == Math.ceil(log)));
		main(null);
	}
}

//OUTPUT
/*
	Enter a number: 1024
	Is power of 2: true
	
	Enter a number: 24
	Is power of 2: false
	
	Enter a number: 4
	Is power of 2: true
	
	Enter a number: 3
	Is power of 2: false	
*/
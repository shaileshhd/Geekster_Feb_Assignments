package week4.Feb_22;

//use while loop to calculate sum of numbers till n. n is taken from the user.

import java.util.*;

public class sumTillN {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum = 0;
		while (n > 0) {
			sum += n;
			n--;
		}
		System.out.println("sum  of num till n = " + sum);
		s.close();
	}
}

//OUTPUT
/*
	15
	sum  of num till n = 120
	
	10
	sum  of num till n = 55
	
	100
	sum  of num till n = 5050
*/
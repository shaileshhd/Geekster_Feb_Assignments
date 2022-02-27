package week4.Feb_22;

import java.util.*;

public class factorialWhileLoop {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		double factorial = 1;
		while (n > 0) {
			factorial *= n;
			n--;
		}
		System.out.println("Factorial = " + factorial);
	}
}

//OUTPUT
/*
	5
	Factorial = 120.0
	
	10
	Factorial = 3628800.0
	
	20
	Factorial = 2.43290200817664E18
*/

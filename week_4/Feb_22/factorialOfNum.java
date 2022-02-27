package week4.Feb_22;

//Apply do while loop to check factorial of a numberr such that program asks user to continue

import java.util.*;

public class factorialOfNum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a num: ");
		int n = s.nextInt();
		double factorial = 1;
		if (n != 0) {
			do {
				factorial *= n;
				n--;
			} while (n > 0);
		}
		System.out.println("Factorial: " + factorial + "\nDo you want to continue? (Y/N): ");
		char c = s.next().charAt(0);
		if (c == 'Y' || c == 'y') {
			main(null);
		}
	}
}


//OUTPUT
/*
	Enter a num: 10
	Factorial: 3628800.0
	Do you want to continue? (Y/N): 
	y
	
	Enter a num: 30
	Factorial: 2.652528598121911E32
	Do you want to continue? (Y/N): 
	n
*/

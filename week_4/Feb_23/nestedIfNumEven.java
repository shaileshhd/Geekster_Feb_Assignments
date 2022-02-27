package week4.Feb_23;

import java.util.*;

public class nestedIfNumEven {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number b/w 0 and 10: ");
		int n = s.nextInt();
		String result = "";
		if (n >= 0) {
			if (n <= 10) {
				if (n % 2 == 0) {
					result = "EVEN";
				} else {
					result = "ODD";
				}
			} else {
				result = "INVALID INPUT";
			}
		} else {
			result = "INVALID INPUT";
		}
		System.out.println(result);
		main(null);
		s.close();
	}
}

//OUTPUT
/*
	Enter a number b/w 0 and 10: 4
	EVEN
	
	Enter a number b/w 0 and 10: 5
	ODD
	
	Enter a number b/w 0 and 10: -4
	INVALID INPUT
	
	Enter a number b/w 0 and 10: 15
	INVALID INPUT
*/
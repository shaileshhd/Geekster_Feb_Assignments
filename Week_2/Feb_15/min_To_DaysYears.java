package com.Feb_15;

import java.util.*;

public class min_To_DaysYears {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Minutes: ");
		float min = s.nextInt();
		int years = 0;
		while (min * 1.9026e-6f > 1) {
			years++;
			min = min - 1 / 1.9026e-6f;
		}
		float days = min * 0.000694444f;
		System.out.print(years + " Year/s and " + days + " Day/s");
		s.close();
	}
}
// 1 min = 0.000694444 days
// 1 min = 1.9026e-6 years
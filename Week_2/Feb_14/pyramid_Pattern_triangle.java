package com.Feb_14;

public class pyramid_Pattern_triangle {
	public static void main(String[] args) {
		int n = 6;
		for (int i = 0; i <= n; i++) {
			for (int k = n - i; k >= 0; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int l = 0; l <= i; l++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
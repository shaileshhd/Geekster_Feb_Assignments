package com.Feb_14;

public class diamond_Shape {
	public static void main(String[] args) {
		int n = 6;
		for (int i = 0; i <= n; i++) {
			for (int k = n - i; k > 0; k--) {
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
		for (int i = n; i >= 0; i--) {
			for (int k = 1; k <= n - i; k++) {
				System.out.print(" ");
			}
			for (int j = i; j >= 0; j--) {
				System.out.print("*");
			}
			for (int l = i; l > 0; l--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
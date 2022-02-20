package com.Feb_14;

public class left_Tri_Decrease {
	public static void main(String[] args) {
		int n = 6;
		for (int i = n; i >= 0; i--) {
			for (int j = i; j >= 0; j--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}

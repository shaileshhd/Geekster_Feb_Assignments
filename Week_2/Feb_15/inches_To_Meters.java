package com.Feb_15;

import java.util.*;

public class inches_To_Meters {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the measurement in Inches: ");
		float inches = s.nextFloat();
		float meters = inches * 0.0254f;
		System.out.print("Converted value to meters is: " + meters + "m");
		s.close();
	}
}

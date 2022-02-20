package com.Feb_17;

import java.util.*;

public class month_Num_Name {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the month number within range: ");
		int n = s.nextInt();
		String month = "";
		switch(n) {
		case 1:
			month = "Jan";
			break;
		case 2:
			month = "Feb";
			break;
		case 3: 
			month = "Mar";
			break;
		case 4:
			month = "April";
			break;
		case 5:
			month = "May";
			break;
		case 6:
			month = "June";
			break;
		case 7:
			month = "July";
			break;
		case 8:
			month = "Aug";
			break;
		case 9:
			month = "Sept";
			break;
		case 10:
			month = "Oct";
			break;
		case 11:
			month = "Nov";
			break;
		case 12:
			month = "Dec";
			break;
		default:
			month = "input number is not valid";
			break;
		} 
		System.out.println(month);
		s.close();
	}
}

package Fed_18_19;

import java.util.*;

public class num_Char_Input {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter first num: ");
		float a = s.nextFloat();
		System.out.print("Enter second num: ");
		float b = s.nextFloat();
		System.out.print("Enter the operation char: ");
		char c = s.next().charAt(0);
		float result = 0;

		if (c == '+') {
			result = a + b;
		} else if (c == '-') {
			result = a - b;
		} else if (c == '/') {
			result = a / b;
		} else if (c == '*') {
			result = a * b;
		} else {
			System.out.print("invaid operation");
		}

		System.out.println(a + " " + c + " " + b + " = " + result);
		main(null);
	}
}

package Fed_18_19;

import java.util.*;

public class f_to_C {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the temperature in °F: ");
		float f = s.nextFloat();
		float c = (f - 32) * 5 / 9;
		System.out.print("Temperature converted to °C: " + c);
		s.close();
	}
}

package Fed_18_19;

import java.util.*;

public class sumOfDigits {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		System.out.print(sum);
	}
}

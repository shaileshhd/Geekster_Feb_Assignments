package week4.Feb_21;

//Find the first 7 terms of (N *6N) where it is divisible by 6

public class first7TermsOfEqn {
	public static void main(String[] args) {
		int count = 0;
		for (int n = 0; count < 7; n++) {
			int eqn = n * 6 * n;
			if (eqn % 6 == 0) {
				System.out.println(eqn);
				count++;
			}
		}
	}
}

//OUTPUT
/*
	0
	6
	24
	54
	96
	150
	216
*/
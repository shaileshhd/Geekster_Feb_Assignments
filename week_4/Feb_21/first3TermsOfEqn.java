package week4.Feb_21;

//Find the first 3 terms of 4N + 9 where it is divisible by 3

public class first3TermsOfEqn {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; count < 3; i++) {
			int eqn = 4 * i + 9;
			if (eqn % 3 == 0) {
				System.out.println(eqn);
				count++;
			}
		}
	}
}

//OUTPUT
/*
	9
	21
	33
*/

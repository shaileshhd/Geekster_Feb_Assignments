package week4.Feb_25;

public class rightArrow {
	public static void main(String[] args) {
		short n = 5;
		for (short x = 1; x <= n; x++) {
			for (short y = 1; y <= x; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (short x = n; x > 0; x--) {
			for (short y = 2; y <= x; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

//OUTPUT
/*
	*
	**
	***
	****
	*****
	****
	***
	**
	*
*/
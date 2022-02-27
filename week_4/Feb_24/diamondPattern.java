package week4.Feb_24;

public class diamondPattern {
	public static void main(String[] args) {
		short n = 5;
		short e = (short) (n - 5);
		for (short x = 1; x <= n * 2; x += 2) {
			for (short s = (short) (n + 3); s > x - e; s -= 2) {
				System.out.print(" ");
			}
			for (short y = 1; y <= x; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (short x = 3; x < n * 2; x += 2) {
			for (short s = 1; s < x; s += 2) {
				System.out.print(" ");
			}
			for (short y = (short) (n * 2); y > x; y--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

//OUTPUT
/*
	    *
	   ***
	  *****
	 *******
	*********
	 *******
	  *****
	   ***
	    *
*/
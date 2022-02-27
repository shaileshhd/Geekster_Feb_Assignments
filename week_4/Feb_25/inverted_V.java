package week4.Feb_25;

public class inverted_V {
	public static void main(String[] args) {
		short n = 5;
		for (short x = 1; x <= n; x++) {
			for (short s = n; s > x; s--) {
				System.out.print(" ");
			}
			for (short y = 1; y <= x; y++) {
				if (y == 1 || y == x) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}

//OUTPUT
/*
	    * 
	   * * 
	  *   * 
	 *     * 
	*       * 
*/
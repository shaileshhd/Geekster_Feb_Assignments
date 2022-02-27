package week4.Feb_24;

public class pyramid_Pattern {
	public static void main(String[] args) {
		int n = 5;
		for (short x = 1; x <= n; x++) {
			for (short s = x; s < n; s++) {
				System.out.print(" ");
			}
			for (short y = 1; y <= x; y++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

//OUTPUT
/*
	    * 
	   * * 
	  * * * 
	 * * * * 
	* * * * * 
*/
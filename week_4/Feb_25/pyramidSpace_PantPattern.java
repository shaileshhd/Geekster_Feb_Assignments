package week4.Feb_25;

public class pyramidSpace_PantPattern {
	public static void main(String[] args) {
		short n = 5;
		short a = 0;
		for(short x = 0; x < n; x++) {
			if(x > 1) {
				a++;
			}
			for(short y = 0; y < n * 2; y++) {
				if(y == n-x) {
					for(short s = 1; s <= x + a; s++) {
						System.out.print(" ");
						y++;
					}
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
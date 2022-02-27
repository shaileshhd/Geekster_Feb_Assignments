package week4.Feb_24;

public class leftTriangle {
	public static void main(String[] args) {
		int n = 5;
		for (short x = 1; x <= 5; x++) {
			for (short y = 1; y <= x; y++) {
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
*/
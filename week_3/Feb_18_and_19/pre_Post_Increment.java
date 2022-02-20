package Fed_18_19;

public class pre_Post_Increment {
	public static void main(String[] args) {
		int a = 10;
		if(++a == 11 || ++a == 12) {
			++a;
		}
		System.out.print(a);
	}
}

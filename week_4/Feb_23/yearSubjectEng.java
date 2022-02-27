package week4.Feb_23;



import java.util.*;

public class yearSubjectEng {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the branch: ");
		String branch = s.next();
		System.out.print("Enter the year: ");
		int year = s.nextInt();
		String subject = "";
		switch (year) {
		case 1:
			subject = "All the subjects are same";
			break;
		case 2:
		case 3:
		case 4:
			switch (branch) {
			case "MECH":
				subject = "Mechanical subjects";
				break;
			case "CSE":
			case "IT":
				subject = "Computer and progremming related subjects";
				break;
			case "ECE":
			case "ELE":
				subject = "Electrical related subjects";
				break;
			default:
				subject = "Invalid Branch";
				break;
			}
			break;
		default:
			subject = "Invalid Year";
			break;
		}
		System.out.println(subject);
		s.close();
	}
}

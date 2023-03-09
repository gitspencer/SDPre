public class SwitchExample {
	public static void main(String[] args) {
		char grade;
		grade = 'A';

		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("Fantastic job!");
			break;
		case 'B':
		case 'b':
			System.out.println("Fantastic job!");
			break;
		case 'C':
		case 'c':
			System.out.println("Fantastic job!");
			break;
		case 'D':
		case 'd':
			System.out.println("Please schedule a conference.");
			break;
		case 'F':
		case 'f':
			System.out.println("Fantastic job!");
			break;
		default:
			System.out.println("Invalid grade.");
		}
	}
}
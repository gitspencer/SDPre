public class Objective7Lab3 {
	public static void main(String[] args) {
		int counter = 1;

			while(counter <= 20) {
				if(counter % 1 == 0) {
					System.out.println(0 + counter + " is odd");
					counter = counter + 1;
				}
				if(counter % 2 == 0) {
					System.out.println(0 + counter + " is even");
					counter = counter + 1;
				}
			}
	}
}
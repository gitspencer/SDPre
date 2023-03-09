public class Objective8Lab3 {
	public static void main(String[] args) {
			for (int counter = 1; counter <= 20; counter ++){
				if(counter % 1 == 0){
					System.out.println(0 + counter + " is odd");
					counter = counter + 1;
				} 
				if(counter % 2 ==0){
					System.out.println(0 + counter + " is even");
				}
			}		
	}
}
import java.util.Scanner;

public class MethodsExample {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String item;
		int quantity;
		System.out.print("Please enter your inventory item: ");
		item = kb.nextLine();
		System.out.print("Please enter the quantity: ");
		quantity = kb.nextInt();
		printInvetory(item, quantity);
	}

	public static void printInvetory(String inventoryItem, int numberOfInventoryItems) {
		System.out.print("There are currently " + numberOfInventoryItems + " " + inventoryItem + " left.");
	}
}
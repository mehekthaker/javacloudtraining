import java.util.*;

public class Discount {

	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the cost of the item");
		double new_item = scanner.nextDouble();
		double discount, newItemPrice=0;
		
		discount = 0.35 * new_item;
		newItemPrice = new_item - discount;
		System.out.println("The new amount is "+newItemPrice);
	}
}
import java.util.Scanner; // Import Scanner class for user input

public class TotalPriceCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter unit price
        System.out.print("Enter the unit price: ");
        double unitPrice = input.nextDouble(); // Read unit price
        
        // Prompt the user to enter quantity
        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt(); // Read quantity
        
        // Calculate total price
        double totalPrice = unitPrice * quantity;
        
        // Display the result
        System.out.printf("The total purchase price is INR %.2f if the quantity is %d and unit price is INR %.2f\n", 
                          totalPrice, quantity, unitPrice);
    }
}

import java.util.Scanner; // Import Scanner class for user input

public class FeeDiscountCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        double fee = input.nextDouble(); // Read user input for fee
        
        double discountPercent = input.nextDouble(); // Read user input for discount percentage
        
        // Calculate the discount amount
        double discount = (fee * discountPercent) / 100;
        
        // Calculate the final fee after discount
        double finalFee = fee - discount;
        
        // Display the results
        System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f\n", discount, finalFee);
    }
}

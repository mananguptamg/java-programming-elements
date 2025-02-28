public class FeeCalculator {
    public static void main(String[] args) {
        // Define the total course fee
        double fee = 125000;
        
        // Define the discount percentage
        double discountPercent = 10;
        
        // Calculate the discount amount
        double discount = (fee * discountPercent) / 100;
        
        // Calculate the final discounted fee
        double finalFee = fee - discount;
        
        // Display the result using a single print statement
        System.out.println(
            "The discount amount is INR " + discount + 
            " and final discounted fee is INR " + finalFee
        );
    }
}

import java.util.Scanner; // Import Scanner class for user input

public class HeightConverter {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        double heightInCm = input.nextDouble(); // Read user input
        
        // Convert cm to inches (1 inch = 2.54 cm)
        double heightInInches = heightInCm / 2.54;
        
        // Convert inches to feet and remaining inches
        int heightInfeet = (int) (heightInInches / 12);  // 1 foot = 12 inches
        double inches = heightInInches % 12;     // Remaining inches
        
        // Display the result
        System.out.printf("Your Height in cm is %.2f while in feet is %d and inches is %.2f\n", heightInCm, heightInfeet, inches);
    }
}

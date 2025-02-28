import java.util.Scanner; // Import Scanner class for user input

public class DoubleOperation {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter three double values
        System.out.print("Enter the first number (a): ");
        double a = input.nextDouble(); // Read first number
        
        System.out.print("Enter the second number (b): ");
        double b = input.nextDouble(); // Read second number
        
        System.out.print("Enter the third number (c): ");
        double c = input.nextDouble(); // Read third number
        
        // Perform arithmetic operations while considering operator precedence
        double result1 = a + b * c;   // Multiplication (*) has higher precedence than Addition (+)
        double result2 = a * b + c;   // Multiplication (*) is done first, then Addition (+)
        double result3 = c + a / b;   // Division (/) is done first, then Addition (+)
        double result4 = a % b + c;   // Modulus (%) is done first, then Addition (+)
        
        // Display the results
        System.out.printf("The results of Double Operations are %.3f, %.3f, %.3f, and %.3f\n", 
                          result1, result2, result3, result4);
    }
}

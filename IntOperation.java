import java.util.Scanner; // Import Scanner class for user input

public class IntOperation {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter three integers
        System.out.print("Enter the first number (a): ");
        int a = input.nextInt(); // Read first number
        
        System.out.print("Enter the second number (b): ");
        int b = input.nextInt(); // Read second number
        
        System.out.print("Enter the third number (c): ");
        int c = input.nextInt(); // Read third number
        
        // Perform integer operations while considering operator precedence
        int result1 = a + b * c;   // Multiplication (*) has higher precedence than Addition (+)
        int result2 = a * b + c;   // Multiplication (*) is done first, then Addition (+)
        int result3 = c + a / b;   // Division (/) is done first, then Addition (+)
        int result4 = a % b + c;   // Modulus (%) is done first, then Addition (+)
        
        // Display the results
        System.out.printf("The results of Int Operations are %d, %d, %d, and %d\n", 
                          result1, result2, result3, result4);
    }
}

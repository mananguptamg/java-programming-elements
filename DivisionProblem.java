import java.util.Scanner; // Import Scanner class for user input

public class DivisionProblem {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        int firstNumber = input.nextInt(); // Read the first number
        
        int secondNumber = input.nextInt(); // Read the second number
        
        // Calculate quotient and remainder
        int quotient = firstNumber / secondNumber;
        int remainder = firstNumber % secondNumber;
        
        // Display the result
        System.out.printf("The Quotient is %d and Remainder is %d of two numbers %d and %d\n", 
                          quotient, remainder, firstNumber, secondNumber);
    }
}

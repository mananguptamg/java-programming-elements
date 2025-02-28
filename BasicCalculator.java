import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter two numbers
        System.out.print("Enter first number: ");
        double firstNumber = input.nextDouble(); // Read first number
        
        System.out.print("Enter second number: ");
        double secondNumber = input.nextDouble(); // Read second number
        
        // Perform operations
        double addition = firstNumber + secondNumber;
        double subtraction = firstNumber - secondNumber;
        double multiplication = firstNumber * secondNumber;
        double division = firstNumber / secondNumber;
        
        // Display the result
        System.out.printf("The addition, subtraction, multiplication, and division value of 2 numbers %.2f and %.2f is %.2f, %.2f, %.2f, and %.2f\n", 
                          firstNumber, secondNumber, addition, subtraction, multiplication, division);
    }
}

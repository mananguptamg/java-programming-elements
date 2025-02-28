import java.util.Scanner; // Import Scanner class for user input

public class SquareSideCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the perimeter
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble(); // Read the perimeter value
        
        // Calculate the side of the square (Perimeter = 4 * side)
        double side = perimeter / 4;
        
        // Display the result
        System.out.printf("The length of the side is %.2f whose perimeter is %.2f\n", side, perimeter);
    }
}

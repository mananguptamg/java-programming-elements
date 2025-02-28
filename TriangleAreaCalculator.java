import java.util.Scanner; // Import Scanner class for user input

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter base and height in centimeters
        System.out.print("Enter the base of the triangle (in cm): ");
        double base = input.nextDouble(); // Read base value
        
        System.out.print("Enter the height of the triangle (in cm): ");
        double height = input.nextDouble(); // Read height value
        
        // Calculate the area of the triangle in square centimeters
        double areaCm2 = 0.5 * base * height;
        
        // Convert square centimeters to square inches (1 square inch = 6.4516 square cm)
        double areaInches2 = areaCm2 / 6.4516;
        
        // Display the results with two decimal places
        System.out.printf("Area of Triangle in square centimeters is %.2f and in square inches is %.2f\n", areaCm2, areaInches2);
    }
}

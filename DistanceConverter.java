import java.util.Scanner; // Import Scanner class for user input

public class DistanceConverter {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble(); // Read user input
        
        // Convert feet to yards (1 yard = 3 feet)
        double distanceInYards = distanceInFeet / 3;
        
        // Convert yards to miles (1 mile = 1760 yards)
        double distanceInMiles = distanceInYards / 1760;
        
        // Display the result
        System.out.printf("The distance in feet is %.2f, in yards is %.2f, and in miles is %.5f\n", 
                          distanceInFeet, distanceInYards, distanceInMiles);
    }
}

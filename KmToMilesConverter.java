import java.util.Scanner; // Import Scanner class for user input

public class KmToMilesConverter {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Declare a variable to store the distance in kilometers
        double km;
     
        km = input.nextDouble(); // Read user input
        
        // Conversion factor: 1 mile = 1.6 km
        double miles = km / 1.6;
        
        // Display the result
        System.out.printf("The total miles is %.2f mile for the given %.2f km\n", miles, km);
    }
}

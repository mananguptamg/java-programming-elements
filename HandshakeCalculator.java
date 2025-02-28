import java.util.Scanner; // Import Scanner class for user input

public class HandshakeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt(); // Read the number of students
        
        // Calculate the maximum number of handshakes using combination formula
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        
        // Display the result
        System.out.printf("The maximum number of possible handshakes among %d students is %d\n", 
                          numberOfStudents, maxHandshakes);
    }
}

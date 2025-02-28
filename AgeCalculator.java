public class AgeCalculator {
    public static void main(String[] args) {
        // Define the birth year of Harry
        int birthYear = 2000;
        
        // Define the current year
        int currentYear = 2025;
        
        // Calculate the age by subtracting the birth year from the current year
        int age = currentYear - birthYear;
        
        // Display the calculated age
        System.out.println("Harry's age in " + currentYear + " is: " + age + " years");
    }
}

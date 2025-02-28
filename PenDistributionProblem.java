public class PenDistributionProblem {
    public static void main(String[] args) {
        // Total number of pens
        int totalPens = 14;
        
        // Total number of students
        int totalStudents = 3;
        
        // Calculate pens per student using division operator
        int pensPerStudent = totalPens / totalStudents;
        
        // Calculate remaining pens using modulus operator
        int remainingPens = totalPens % totalStudents;
        
        // Display the result
        System.out.println(
            "The Pen Per Student is " + pensPerStudent + 
            " and the remaining pen not distributed is " + remainingPens
        );
    }
}


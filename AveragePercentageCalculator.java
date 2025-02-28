public class AveragePercentageCalculator {
    public static void main(String[] args) {
        // Marks obtained in each subject
        int mathsMark = 94;
        int physicsMark = 95;
        int chemistryMark = 96;
        
        // Total number of subjects
        int totalSubjects = 3;
        
        // Maximum marks per subject
        int maxMarksPerSubject = 100;
        
        // Calculate total marks obtained
        int totalMarksObtained = mathsMark + physicsMark + chemistryMark;
        
        // Calculate total maximum marks
        int totalMaxMarks = totalSubjects * maxMarksPerSubject;
        
        // Calculate average percentage
        double averagePercentage = (totalMarksObtained / (double) totalMaxMarks) * 100;
        
        // Display the result
        System.out.println("Sam's average mark in PCM is " + averagePercentage + "%");
    }
}

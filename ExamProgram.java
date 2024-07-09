import java.util.Scanner;

public class ExamProgram {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numAssessments = countCourseworkAssessments();
        int choice;
        
        do {
            System.out.println("\nWelcome to the Exam Program");
            System.out.println("1. View coursework results");
            System.out.println("2. View exam results");
            System.out.println("3. Exit the program");
            System.out.print("Please enter your choice (1/2/3): ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    viewCourseworkResults(numAssessments);
                    break;
                case 2:
                    viewExamResults();
                    break;
                case 3:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
            
        } while (choice != 3);
        
        scanner.close();
    }
    
    public static int countCourseworkAssessments() {
        // Simulating counting the number of coursework assessments done in DIT409 unit
        int numAssessments = 5; // Assuming there are 5 assessments for example purposes
        return numAssessments;
    }
    
    public static void viewCourseworkResults(int numAssessments) {
        System.out.println("\nCoursework Results:");
        System.out.println("Number of coursework assessments done in DIT409 unit: " + numAssessments);
        
        // Check if student has done at least 2/3 of coursework
        if (numAssessments >= 2) {
            System.out.println("Student has completed 2/3 of coursework.");
        } else {
            System.out.println("Student has not completed 2/3 of coursework. Student needs to repeat.");
        }
    }
    
    public static void viewExamResults() {
        // Simulating viewing exam results
        int finalExamGrade = 80; // Example final exam grade (out of 100)
        
        System.out.println("\nExam Results:");
        System.out.println("Final Exam Grade: " + finalExamGrade);
        
        int courseworkScore = calculateCourseworkScore();
        int totalScore = finalExamGrade + courseworkScore;
        
        System.out.println("Total Coursework Score: " + courseworkScore);
        System.out.println("Total Score (Final Exam + Coursework): " + totalScore);
    }
    
    public static int calculateCourseworkScore() {
        // Simulating calculation of coursework score based on given formula
        // Example calculation: Assuming each assessment contributes equally
        int numAssessments = 5; // Number of assessments
        int courseworkScore = numAssessments * 10; // Assuming each assessment is out of 10 points
        return courseworkScore;
    }
}
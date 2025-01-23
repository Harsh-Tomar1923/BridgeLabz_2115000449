package Array2;

import java.util.Scanner;

public class StudentGradesCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        // Create arrays to store marks, percentages, and grades
        int[][] marks = new int[numStudents][3]; // 3 columns: [Physics, Chemistry, Maths]
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];

        // Take input for marks of each student in physics, chemistry, and maths
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                String subject = j == 0 ? "Physics" : (j == 1 ? "Chemistry" : "Maths");

                // Validate input to ensure positive marks
                do {
                    System.out.print(subject + ": ");
                    marks[i][j] = sc.nextInt();
                    if (marks[i][j] < 0) {
                        System.out.println("Marks must be non-negative. Please enter again.");
                    }
                } while (marks[i][j] < 0);
            }
        }

        // Calculate percentage and grade for each student
        for (int i = 0; i < numStudents; i++) {
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (totalMarks / 300.0) * 100; // Calculate percentage

            // Determine grade based on percentage
            if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
            } else if (percentages[i] >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R"; // Fail grade
            }
        }

        // Display the marks, percentages, and grades of each student
        System.out.println("\nStudent Details:");
        System.out.println("------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s\n", "Student", "Physics", "Chemistry", "Maths", "Percent", "Grade");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.2f %-10s\n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }
    }
}

package method2;

import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if the student can vote based on their age
    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false;  // Invalid age (negative number)
        } else if (age >= 18) {
            return true;  // Age 18 or above, can vote
        } else {
            return false;  // Age below 18, cannot vote
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentVoteChecker voteChecker = new StudentVoteChecker();

        // Array to store the age of 10 students
        int[] studentAges = new int[10];

        // Loop through the array to take age input for each student
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();

            // Check if the student can vote and display the result
            boolean canVote = voteChecker.canStudentVote(studentAges[i]);
            if (canVote) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }
    }
}

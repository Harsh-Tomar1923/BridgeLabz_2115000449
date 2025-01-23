package array1;

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        // Create an array to store ages of 10 students
        int[] ages = new int[10];
        Scanner scanner = new Scanner(System.in);

        // Input ages for 10 students
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }

        // Check voting eligibility
        for (int age : ages) {
            if (age < 0) {
                System.out.println("Invalid age: " + age);
            } else if (age >= 18) {
                System.out.println("The student with the age " + age + " can vote.");
            } else {
                System.out.println("The student with the age " + age + " cannot vote.");
            }
        }
    }
}

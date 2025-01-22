package five;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Step 1: Initialize the necessary variables
        int sum = 0;
        int originalNumber = number;
        int remainder;

        // Step 2: Use while loop to process each digit of the number
        while (number != 0) {
            // Find the remainder (last digit)
            remainder = number % 10;

            // Cube the remainder and add it to sum
            sum += remainder * remainder * remainder;

            // Remove the last digit from the number
            number /= 10;
        }

        // Step 3: Check if the sum of cubes equals the original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}

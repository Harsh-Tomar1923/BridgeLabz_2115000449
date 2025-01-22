package four;

import java.util.Scanner;

public class FactorialUsingForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get a positive integer from the user
        System.out.print("Enter a positive integer to find its factorial: ");
        int number = scanner.nextInt();

        // Check if the number is positive
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers. Please enter a positive integer.");
            return;
        }

        // Initialize factorial result
        long factorial = 1; // Use long to handle large values

        // Compute factorial using a for loop
        for (int i = 1; i <= number; i++) {
            factorial *= i; // Multiply factorial by the current value of i
        }

        // Output the factorial
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}

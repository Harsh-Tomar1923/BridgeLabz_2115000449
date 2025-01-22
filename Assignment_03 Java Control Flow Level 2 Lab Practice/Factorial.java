package four;

import java.util.Scanner;

public class Factorial {
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

        // Initialize factorial result and counter
        long factorial = 1; // Use long to handle large values
        int counter = 1;

        // Compute factorial using a while loop
        while (counter <= number) {
            factorial *= counter; // Multiply factorial by counter
            counter++; // Increment counter
        }

        // Output the factorial
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}

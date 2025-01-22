package four;

import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize total to 0
        double total = 0.0;

        System.out.println("Enter numbers to add (Enter 0 or a negative number to stop):");

        // Infinite while loop
        while (true) {
            // Get user input
            double userInput = scanner.nextDouble();

            // Check if the input is 0 or a negative number
            if (userInput <= 0) {
                break; // Exit the loop
            }

            // Add the input to the total
            total += userInput;
        }

        // Display the total sum
        System.out.println("The total sum is: " + total);
    }
}


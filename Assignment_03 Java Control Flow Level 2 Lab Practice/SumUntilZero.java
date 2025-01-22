package four;

import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize total to 0
        double total = 0.0;

        // Variable to store user input
        double userInput;

        System.out.println("Enter numbers to add (Enter 0 to stop):");

        // While loop to continue until the user enters 0
        while (true) {
            // Get user input
            userInput = scanner.nextDouble();

            // Check if the input is 0
            if (userInput == 0) {
                break; // Exit the loop
            }

            // Add the input to the total
            total += userInput;
        }

        // Display the total sum
        System.out.println("The total sum is: " + total);
    }
}

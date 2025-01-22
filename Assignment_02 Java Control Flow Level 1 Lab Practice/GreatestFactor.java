package three;

import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Initialize greatestFactor variable
        int greatestFactor = 1;

        // Loop from (number - 1) down to 1
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) { // Check if i is a factor of number
                greatestFactor = i; // Assign the greatest factor
                break; // Exit the loop
            }
        }

        // Display the greatest factor
        System.out.println("The greatest factor of " + number + " (besides itself) is: " + greatestFactor);
    }
}

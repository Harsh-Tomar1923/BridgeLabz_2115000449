package five;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get an integer from the user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Step 1: Initialize count variable to 0
        int count = 0;

        // Step 2: Handle negative numbers
        number = Math.abs(number);

        // Step 3: Use loop to count the number of digits
        while (number != 0) {
            // Remove the last digit from the number
            number /= 10;

            // Increment the count for each digit
            count++;
        }

        // Step 4: Display the count of digits
        System.out.println("The number has " + count + " digits.");
    }
}

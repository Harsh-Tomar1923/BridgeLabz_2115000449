package four;

import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get an integer from the user
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the number is a natural number
        if (number < 1) {
            System.out.println("Please enter a natural number (1 or greater).");
            return;
        }

        // Iterate from 1 to the user-entered number
        for (int i = 1; i <= number; i++) {
            // Check if the current number is even or odd
            if (i % 2 == 0) {
                System.out.println(i + " is an even number.");
            } else {
                System.out.println(i + " is an odd number.");
            }
        }
    }
}

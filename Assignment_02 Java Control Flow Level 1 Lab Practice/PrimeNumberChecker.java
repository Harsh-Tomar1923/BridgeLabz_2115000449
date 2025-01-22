package three;

import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number greater than 1: ");
        int number = scanner.nextInt();

        // Validate input
        if (number <= 1) {
            System.out.println("The number must be greater than 1.");
        } else {
            // Initialize isPrime as true
            boolean isPrime = true;

            // Check divisibility
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false; // Number is divisible by i
                    break;           // Exit the loop
                }
            }

            // Output the result
            if (isPrime) {
                System.out.println(number + " is a Prime Number.");
            } else {
                System.out.println(number + " is not a Prime Number.");
            }
        }
    }
}

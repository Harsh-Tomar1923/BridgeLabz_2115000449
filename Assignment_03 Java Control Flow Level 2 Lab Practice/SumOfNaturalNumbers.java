package four;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();

        // Check if the input is a natural number
        try {
            int n = Integer.parseInt(input);

            if (n > 0) {
                // Compute sum using the formula
                int sumFormula = n * (n + 1) / 2;

                // Compute sum using a while loop
                int sumWhile = 0;
                int i = 1;
                while (i <= n) {
                    sumWhile += i;
                    i++;
                }

                // Compare results
                if (sumFormula == sumWhile) {
                    System.out.println("The sum of first " + n + " natural numbers is: " + sumWhile);
                    System.out.println("Both computations are correct!");
                } else {
                    System.out.println("Mismatch in results. Check the computations.");
                }
            } else {
                System.out.println("Please enter a valid natural number (greater than 0).");
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid natural number (greater than 0).");
        }
    }
}

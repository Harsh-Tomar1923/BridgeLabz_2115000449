package four;

import java.util.Scanner;
public class SumOfNaturalNumbersUsingForLoop {
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

                // Compute sum using a for loop
                int sumFor = 0;
                for (int i = 1; i <= n; i++) {
                    sumFor += i;
                }

                // Compare results
                if (sumFormula == sumFor) {
                    System.out.println("The sum of first " + n + " natural numbers is: " + sumFor);
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

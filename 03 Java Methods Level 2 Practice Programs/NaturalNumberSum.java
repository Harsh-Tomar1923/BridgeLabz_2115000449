package method2;

import java.util.Scanner;

public class NaturalNumberSum {

    // Method to find the sum of n natural numbers using recursion
    public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1; // Base case
        } else {
            return n + sumUsingRecursion(n - 1); // Recursive call
        }
    }

    // Method to find the sum of n natural numbers using the formula n*(n+1)/2
    public static int sumUsingFormula(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the number
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        // Check if the number is a natural number
        if (n <= 0) {
            System.out.println("Please enter a valid natural number greater than zero.");
        } else {
            // Calculating the sum using recursion
            int sumRecursion = sumUsingRecursion(n);

            // Calculating the sum using the formula
            int sumFormula = sumUsingFormula(n);

            // Comparing the results
            System.out.println("Sum of the first " + n + " natural numbers using recursion: " + sumRecursion);
            System.out.println("Sum of the first " + n + " natural numbers using the formula: " + sumFormula);

            // Verify if both sums match
            if (sumRecursion == sumFormula) {
                System.out.println("Both methods give the correct result!");
            } else {
                System.out.println("The results do not match.");
            }
        }
    }
}


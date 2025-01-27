package method2;

import java.util.Scanner;

public class FactorCalculator {

    // Method to find factors of a number and store them in an array
    public static int[] findFactors(int number) {
        int count = 0;

        // First loop to count the factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Initialize the array to store the factors
        int[] factors = new int[count];
        int index = 0;

        // Second loop to store the factors in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to find the sum of the factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the sum of squares of the factors
    public static double sumOfSquaresOfFactors(int[] factors) {
        double sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Finding the factors of the number
        int[] factors = findFactors(number);

        // Displaying the factors
        System.out.print("Factors of " + number + " are: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Calculating the sum of factors
        int sum = sumOfFactors(factors);
        System.out.println("Sum of factors: " + sum);

        // Calculating the product of factors
        int product = productOfFactors(factors);
        System.out.println("Product of factors: " + product);

        // Calculating the sum of squares of factors
        double sumOfSquares = sumOfSquaresOfFactors(factors);
        System.out.println("Sum of squares of factors: " + sumOfSquares);
    }
}


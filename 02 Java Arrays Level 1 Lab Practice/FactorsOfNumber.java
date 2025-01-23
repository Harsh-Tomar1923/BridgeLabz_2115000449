package array1;

import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        // Create a scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Get the input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a positive integer
        if (number <= 0) {
            System.out.println("Please enter a valid positive number.");
            return;
        }

        // Initialize variables
        int maxFactor = 10;  // Initial size of the factors array
        int[] factors = new int[maxFactor];  // Array to store the factors
        int index = 0;  // Index variable to store factors

        // Loop through the numbers from 1 to the number to find factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {  // Check if i is a factor
                // Check if the array needs resizing
                if (index == maxFactor) {
                    maxFactor *= 2;  // Double the size of the array
                    int[] temp = new int[maxFactor];  // Create a temporary array with new size

                    // Copy elements from factors array to temp array
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }

                    // Assign temp array to factors array
                    factors = temp;
                }

                // Store the factor in the array
                factors[index++] = i;
            }
        }

        // Display the factors
        System.out.println("The factors of " + number + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}


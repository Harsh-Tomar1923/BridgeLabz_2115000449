package array1;

import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        // Create a scanner to take input from the user
        Scanner sc = new Scanner(System.in);

        // Get the input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check if the input is a natural number
        if (number <= 0) {
            System.out.println("Error: Please enter a natural number greater than 0.");
            return;
        }

        // Calculate the size of the odd and even arrays
        int size = number / 2 + 1;

        // Create arrays for odd and even numbers
        int[] oddNumbers = new int[size];
        int[] evenNumbers = new int[size];

        // Initialize index variables for both arrays
        int oddIndex = 0, evenIndex = 0;

        // Iterate from 1 to the number and separate odd and even numbers
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i;  // Save even number
            } else {
                oddNumbers[oddIndex++] = i;   // Save odd number
            }
        }

        // Print the odd and even numbers
        System.out.println("Odd numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }

        System.out.println("\nEven numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
    }
}

package Array2;

import java.util.Scanner;

public class LargestSecondLargest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variable to store the number and the maximum number of digits
        int number;
        int maxDigit = 10; // Maximum number of digits
        int[] digits = new int[maxDigit];
        int index = 0;

        // Take user input for the number
        System.out.print("Enter a number: ");
        number = sc.nextInt();

        // Extract digits and store them in the array
        while (number != 0) {
            digits[index] = number % 10; // Get the last digit
            number = number / 10;         // Remove the last digit
            index++;

            // If the number of digits exceeds the maximum, break out of the loop
            if (index == maxDigit) {
                break;
            }
        }

        // Variables to store the largest and second-largest digits
        int largest = -1;
        int secondLargest = -1;

        // Loop through the array to find the largest and second-largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] < largest) {
                secondLargest = digits[i];
            }
        }

        // Display the largest and second-largest digits
        if (secondLargest == -1) {
            System.out.println("There is no second largest digit.");
        } else {
            System.out.println("Largest digit: " + largest);
            System.out.println("Second largest digit: " + secondLargest);
        }
    }
}

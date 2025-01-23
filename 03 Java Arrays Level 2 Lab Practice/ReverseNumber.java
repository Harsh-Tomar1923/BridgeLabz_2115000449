package Array2;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Find the count of digits in the number
        int temp = number;
        int count = 0;
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        // Create an array to store the digits
        int[] digits = new int[count];

        // Find the digits and store them in the array
        temp = number;
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;  // Get the last digit
            temp = temp / 10;       // Remove the last digit
        }

        // Create an array to store digits in reverse order
        int[] reversedDigits = new int[count];

        // Reverse the digits by copying them into reversedDigits array
        for (int i = 0; i < count; i++) {
            reversedDigits[i] = digits[count - 1 - i];
        }

        // Display the elements of the array in reverse order
        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reversedDigits[i]);
        }
        System.out.println();
    }
}

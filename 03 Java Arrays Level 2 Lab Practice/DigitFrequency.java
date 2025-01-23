package Array2;

import java.util.Scanner;

public class DigitFrequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Convert the number to positive if it's negative
        if (number < 0) {
            number = Math.abs(number);
        }

        // Create an array to store the digits
        int[] digits = new int[10];
        int[] frequency = new int[10]; // Array to store frequency of digits

        // Extract digits and update the frequency array
        while (number != 0) {
            int digit = number % 10; // Extract the last digit
            frequency[digit]++;      // Increment the frequency of the digit
            number /= 10;            // Remove the last digit
        }

        // Display the frequency of each digit
        System.out.println("Digit\tFrequency");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) { // Display only digits that appear in the number
                System.out.println(i + "\t" + frequency[i]);
            }
        }
    }
}

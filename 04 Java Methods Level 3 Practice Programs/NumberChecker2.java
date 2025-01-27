package method3;

import java.util.Arrays;

public class NumberChecker2 {

    // Method to find the count of digits in a number
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    // Method to store the digits of the number in a digits array
    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to find the sum of the digits of the number
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits of the number
    public static double sumOfSquaresOfDigits(int[] digits) {
        double sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int number) {
        int[] digits = storeDigits(number);
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    // Method to find the frequency of each digit in the number
    public static int[][] digitFrequency(int[] digits) {
        int[][] frequency = new int[10][2]; // 10 digits (0-9)

        // Initialize the first column with digits (0-9)
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
            frequency[i][1] = 0;
        }

        // Count the frequency of each digit
        for (int digit : digits) {
            frequency[digit][1]++;
        }

        return frequency;
    }

    public static void main(String[] args) {
        int number = 21;  // Example number

        // Find and print the count of digits
        int count = countDigits(number);
        System.out.println("Count of digits: " + count);

        // Find and print the digits of the number
        int[] digits = storeDigits(number);
        System.out.println("Digits of the number: " + Arrays.toString(digits));

        // Find and print the sum of the digits
        int sum = sumOfDigits(digits);
        System.out.println("Sum of digits: " + sum);

        // Find and print the sum of the squares of the digits
        double sumOfSquares = sumOfSquaresOfDigits(digits);
        System.out.println("Sum of squares of digits: " + sumOfSquares);

        // Check and print if the number is a Harshad number
        boolean isHarshad = isHarshadNumber(number);
        System.out.println("Is Harshad Number? " + isHarshad);

        // Find and print the frequency of each digit
        int[][] frequency = digitFrequency(digits);
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                System.out.println("Digit " + frequency[i][0] + ": " + frequency[i][1] + " times");
            }
        }
    }
}

package method3;

import java.util.Arrays;

public class NumberChecker3 {

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

    // Method to reverse the digits array
    public static int[] reverseDigits(int[] digits) {
        int[] reversedDigits = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversedDigits[i] = digits[digits.length - 1 - i];
        }
        return reversedDigits;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean areArraysEqual(int[] array1, int[] array2) {
        return Arrays.equals(array1, array2);
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        int[] digits = storeDigits(number);
        int[] reversedDigits = reverseDigits(digits);
        return areArraysEqual(digits, reversedDigits);
    }

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int number) {
        int[] digits = storeDigits(number);
        for (int digit : digits) {
            if (digit != 0) {
                return true; // A duck number has at least one non-zero digit
            }
        }
        return false; // If all digits are zero, it's not a duck number
    }

    public static void main(String[] args) {
        int number = 212;  // Example number

        // Find and print the count of digits
        int count = countDigits(number);
        System.out.println("Count of digits: " + count);

        // Find and print the digits of the number
        int[] digits = storeDigits(number);
        System.out.println("Digits of the number: " + Arrays.toString(digits));

        // Find and print the reversed digits
        int[] reversedDigits = reverseDigits(digits);
        System.out.println("Reversed digits: " + Arrays.toString(reversedDigits));

        // Check and print if the number is a palindrome
        boolean isPalindrome = isPalindrome(number);
        System.out.println("Is Palindrome? " + isPalindrome);

        // Check and print if the number is a duck number
        boolean isDuckNumber = isDuckNumber(number);
        System.out.println("Is Duck Number? " + isDuckNumber);
    }
}

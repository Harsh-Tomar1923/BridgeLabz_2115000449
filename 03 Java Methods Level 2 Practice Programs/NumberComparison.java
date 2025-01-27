package method2;

import java.util.Scanner;

public class NumberComparison {

    // Method to check whether the number is positive or negative
    public static String isPositive(int number) {
        if (number < 0) {
            return "Negative";
        } else {
            return "Positive";
        }
    }

    // Method to check whether the number is even or odd
    public static String isEven(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    // Method to compare two numbers
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1; // number1 is greater
        } else if (number1 == number2) {
            return 0; // both are equal
        } else {
            return -1; // number1 is smaller
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store 5 numbers
        int[] numbers = new int[5];

        // Input the 5 numbers from the user
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Loop through the array and check whether the number is positive or negative
        for (int i = 0; i < numbers.length; i++) {
            String positivity = isPositive(numbers[i]);
            System.out.print("Number " + (i + 1) + " (" + numbers[i] + ") is " + positivity);

            // If the number is positive, check if it is even or odd
            if (positivity.equals("Positive")) {
                String evenOrOdd = isEven(numbers[i]);
                System.out.println(" and it is " + evenOrOdd + ".");
            } else {
                System.out.println(".");
            }
        }

        // Compare the first and last elements of the array
        int comparisonResult = compare(numbers[0], numbers[4]);

        if (comparisonResult == 1) {
            System.out.println("The first number is greater than the last number.");
        } else if (comparisonResult == 0) {
            System.out.println("The first number is equal to the last number.");
        } else {
            System.out.println("The first number is less than the last number.");
        }
    }
}

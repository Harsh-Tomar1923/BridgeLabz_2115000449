package method1;

import java.util.Scanner;

public class NumberCheck {

    // Method to check whether a number is positive, negative, or zero
    public static int checkNumber(int number) {
        if (number > 0) {
            return 1; // Positive number
        } else if (number < 0) {
            return -1; // Negative number
        } else {
            return 0; // Zero
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calling the method to check the number
        int result = checkNumber(number);

        // Displaying the result
        if (result == 1) {
            System.out.println("The number is positive.");
        } else if (result == -1) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        scanner.close();
    }
}

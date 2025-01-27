package method1;

import java.util.Scanner;

public class QuotientAndRemainder {

    // Method to find the quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for two numbers
        System.out.print("Enter the dividend (number): ");
        int number = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        // Calling the method to find quotient and remainder
        int[] result = findRemainderAndQuotient(number, divisor);

        // Displaying the result
        System.out.println("The quotient is: " + result[0]);
        System.out.println("The remainder is: " + result[1]);
    }
}

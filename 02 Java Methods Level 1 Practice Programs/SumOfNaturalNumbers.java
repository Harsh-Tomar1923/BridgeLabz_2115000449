package method1;

import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Method to calculate the sum of n natural numbers
    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the number
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than zero.");
        } else {
            // Calling the method to calculate the sum
            int sum = calculateSum(n);

            // Displaying the result
            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        }
    }
}

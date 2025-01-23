package array1;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        // Initialize array and variables
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        Scanner sc = new Scanner(System.in);

        // Infinite loop to take user input
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double input = sc.nextDouble();

            // Check for termination conditions
            if (input <= 0 || index == 10) break;

            // Store the number in the array and increment index
            numbers[index] = input;
            index++;
        }

        // Calculate the total and display all numbers
        System.out.println("You entered the following numbers:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i]+"  ");
            total += numbers[i];
        }

        // Display the total
        System.out.println("\nThe total sum of the numbers is: " + total);
    }
}

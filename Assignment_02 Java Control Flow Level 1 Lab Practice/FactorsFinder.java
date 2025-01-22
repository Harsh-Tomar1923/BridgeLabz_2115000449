package three;
import java.util.Scanner;

public class FactorsFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Find and display the factors
        System.out.println("Factors of " + number + " are:");

        // Loop from 1 to number-1 to find the factors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {  // Check if i is a factor of number
                System.out.println(i);  // Print the factor
            }
        }
    }
}

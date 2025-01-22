package BL;
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Taking input
        System.out.print("Enter the first number: ");
        double number1 = input.nextDouble();

        // Taking input
        System.out.print("Enter the second number: ");
        double number2 = input.nextDouble();

        // Perform arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        // Output the results
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is ");
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
    }
}

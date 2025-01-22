package five;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Input: Declare variables
        double first, second;
        String op;

        Scanner scanner = new Scanner(System.in);

        // Get input values for first number, operator, and second number
        System.out.print("Enter the first number: ");
        first = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        op = scanner.next();

        System.out.print("Enter the second number: ");
        second = scanner.nextDouble();

        // Switch-case to perform the operation
        switch (op) {
            case "+":
                System.out.println("Result: " + (first + second));
                break;
            case "-":
                System.out.println("Result: " + (first - second));
                break;
            case "*":
                System.out.println("Result: " + (first * second));
                break;
            case "/":
                if (second != 0) {
                    System.out.println("Result: " + (first / second));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid Operator.");
                break;
        }
    }
}

package BL;

import java.util.Scanner;

public class SquareSideCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user for the perimeter of the square
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();

        // Calculate the side length of the square
        double side = perimeter / 4;

        // Output the result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}

package BL;

import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Taking the input
        System.out.print("Enter the base of the triangle in centimeters: ");
        double base = input.nextDouble();

        // Taking the input
        System.out.print("Enter the height of the triangle in centimeters: ");
        double height = input.nextDouble();

        // Calculate the area in square centimeters
        double areaCm2 = 0.5 * base * height;

        // Convert the area to square inches (1 cm^2 = 0.155 square inches)
        double areaIn2 = areaCm2 * 0.155;

        // Output the results
        System.out.println("The area of the triangle is " + areaCm2 + " square centimeters and " + areaIn2 + " square inches.");
    }
}


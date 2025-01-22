package BL;

import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Taking the input
        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();

        // Conversion factors
        double cmToInches = 1.0 / 2.54;
        double inchesToFeet = 1.0 / 12;

        // Convert height to inches
        double totalInches = heightCm * cmToInches;

        // Convert inches to feet and remaining inches
        int feet = (int) (totalInches * inchesToFeet);
        double remainingInches = totalInches % 12;

        // Output the results
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + remainingInches);
    }
}

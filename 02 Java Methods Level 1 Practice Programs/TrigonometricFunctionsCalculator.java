package method1;

import java.util.Scanner;

public class TrigonometricFunctionsCalculator {

    // Method to calculate trigonometric functions: sine, cosine, and tangent
    public static double[] calculateTrigonometricFunctions(double angle) {
        // Convert angle from degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate sine, cosine, and tangent
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        // Return the results in an array
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the angle in degrees
        System.out.print("Enter the angle in degrees: ");
        double angle = scanner.nextDouble();

        // Calling the method to calculate trigonometric functions
        double[] results = calculateTrigonometricFunctions(angle);

        // Displaying the results
        System.out.println("Sine of " + angle + " degrees is: " + results[0]);
        System.out.println("Cosine of " + angle + " degrees is: " + results[1]);
        System.out.println("Tangent of " + angle + " degrees is: " + results[2]);
    }
}

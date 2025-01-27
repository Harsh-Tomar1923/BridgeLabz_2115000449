package method1;

import java.util.Scanner;

public class TriangularParkRun {

    // Method to calculate the number of rounds required
    public static int calculateRounds(double side1, double side2, double side3, double totalDistance) {
        double perimeter = side1 + side2 + side3; // Calculate perimeter of the triangle
        return (int) Math.ceil(totalDistance / perimeter); // Calculate and round up the number of rounds
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the sides of the triangular park
        System.out.print("Enter the length of side 1 (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of side 2 (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of side 3 (in meters): ");
        double side3 = scanner.nextDouble();

        double totalDistance = 5000; // Total distance to run in meters (5 km)

        // Calling the method to calculate the number of rounds
        int rounds = calculateRounds(side1, side2, side3, totalDistance);

        // Displaying the result
        System.out.println("The athlete must complete " + rounds + " rounds to run 5 km.");
    }
}

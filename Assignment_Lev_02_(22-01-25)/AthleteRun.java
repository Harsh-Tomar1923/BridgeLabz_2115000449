package level2;

import java.util.Scanner;

public class AthleteRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the sides of the triangular park in meters
        System.out.print("Enter the length of side1 (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of side2 (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of side3 (in meters): ");
        double side3 = scanner.nextDouble();

        // Calculate the perimeter of the triangular park
        double perimeter = side1 + side2 + side3;

        // Total distance to run in meters (5 km = 5000 meters)
        double totalDistance = 5000;

        // Calculate the number of rounds needed
        double rounds = totalDistance / perimeter;

        // Output the result
        System.out.println("The total number of rounds the athlete will run is " + Math.ceil(rounds) + " to complete 5 km");
    }
}

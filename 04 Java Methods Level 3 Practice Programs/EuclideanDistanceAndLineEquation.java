package method3;

import java.util.Scanner;

public class EuclideanDistanceAndLineEquation {

    // Method to calculate the Euclidean distance between two points
    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        // Euclidean distance formula: distance = sqrt((x2 - x1)^2 + (y2 - y1)^2)
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    // Method to calculate the equation of the line given two points
    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        // Slope formula: m = (y2 - y1) / (x2 - x1)
        double m = (y2 - y1) / (x2 - x1);

        // Y-intercept formula: b = y1 - m * x1
        double b = y1 - m * x1;

        // Returning an array containing the slope (m) and y-intercept (b)
        return new double[]{m, b};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking inputs for the two points (x1, y1) and (x2, y2)
        System.out.print("Enter the x1 coordinate: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter the y1 coordinate: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter the x2 coordinate: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter the y2 coordinate: ");
        double y2 = scanner.nextDouble();

        // Calculate and display the Euclidean distance between the two points
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.printf("The Euclidean distance between the two points is: %.2f" , distance);

        // Calculate the equation of the line using the two points
        double[] lineEquation = calculateLineEquation(x1, y1, x2, y2);
        double m = lineEquation[0];
        double b = lineEquation[1];

        // Display the equation of the line
        System.out.println("\n The equation of the line is: y = " + m + "x + " + b);
    }
}

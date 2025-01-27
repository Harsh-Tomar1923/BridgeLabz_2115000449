package method2;

import java.util.Scanner;

public class Quadratic {

    // Method to find the roots of the quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        // Calculate the discriminant (delta)
        double delta = Math.pow(b, 2) - 4 * a * c;

        // If delta is negative, no real roots exist
        if (delta < 0) {
            return new double[0]; // Return an empty array if no real roots
        }

        // If delta is zero, one real root exists
        if (delta == 0) {
            double root = -b / (2 * a);
            return new double[] { root }; // Return the single root
        }

        // If delta is positive, two real roots exist
        double root1 = (-b + Math.sqrt(delta)) / (2 * a);
        double root2 = (-b - Math.sqrt(delta)) / (2 * a);
        return new double[] { root1, root2 }; // Return both roots
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input values for a, b, and c
        System.out.print("Enter the coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the coefficient c: ");
        double c = scanner.nextDouble();

        // Find the roots of the quadratic equation
        double[] roots = findRoots(a, b, c);

        // Display the results
        if (roots.length == 0) {
            System.out.println("No real roots exist.");
        } else if (roots.length == 1) {
            System.out.println("One real root: " + roots[0]);
        } else {
            System.out.println("Two real roots: " + roots[0] + " and " + roots[1]);
        }
    }
}

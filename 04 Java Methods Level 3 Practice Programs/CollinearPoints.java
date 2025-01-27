package method3;
import java.util.Scanner;

public class CollinearPoints {

    // Method to check collinearity using slope formula
    public static boolean isCollinearUsingSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeAC = (y3 - y1) / (x3 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        return slopeAB == slopeAC && slopeAB == slopeBC;
    }

    // Method to check collinearity using area of triangle formula
    public static boolean isCollinearUsingArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking inputs for three points
        System.out.println("Enter coordinates for Point A (x1, y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Enter coordinates for Point B (x2, y2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        System.out.println("Enter coordinates for Point C (x3, y3): ");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        // Check collinearity using slope formula
        boolean collinearSlope = isCollinearUsingSlope(x1, y1, x2, y2, x3, y3);
        System.out.println("Are the points collinear using slope formula? " + collinearSlope);

        // Check collinearity using area of triangle formula
        boolean collinearArea = isCollinearUsingArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Are the points collinear using area formula? " + collinearArea);
    }
}
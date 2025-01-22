package BL;
import java.util.Scanner;

public class KilometerToMilesConverter {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Taking the input
        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();

        // Calculate miles
        double miles = km * 1.6;

        // Output the result
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
    }
}

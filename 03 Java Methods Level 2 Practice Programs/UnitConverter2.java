package method2;

import java.util.Scanner;

public class UnitConverter2 {

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to select the conversion type
        System.out.println("Select the conversion type:");
        System.out.println("1. Yards to Feet");
        System.out.println("2. Feet to Yards");
        System.out.println("3. Meters to Inches");
        System.out.println("4. Inches to Meters");
        System.out.println("5. Inches to Centimeters");

        int choice = scanner.nextInt();

        double value;
        double result;

        switch (choice) {
            case 1:
                System.out.print("Enter value in Yards: ");
                value = scanner.nextDouble();
                result = convertYardsToFeet(value);
                System.out.println(value + " yards is equal to " + result + " feet.");
                break;

            case 2:
                System.out.print("Enter value in Feet: ");
                value = scanner.nextDouble();
                result = convertFeetToYards(value);
                System.out.println(value + " feet is equal to " + result + " yards.");
                break;

            case 3:
                System.out.print("Enter value in Meters: ");
                value = scanner.nextDouble();
                result = convertMetersToInches(value);
                System.out.println(value + " meters is equal to " + result + " inches.");
                break;

            case 4:
                System.out.print("Enter value in Inches: ");
                value = scanner.nextDouble();
                result = convertInchesToMeters(value);
                System.out.println(value + " inches is equal to " + result + " meters.");
                break;

            case 5:
                System.out.print("Enter value in Inches: ");
                value = scanner.nextDouble();
                result = convertInchesToCentimeters(value);
                System.out.println(value + " inches is equal to " + result + " centimeters.");
                break;

            default:
                System.out.println("Invalid choice. Please select a valid option.");
                break;
        }
    }
}


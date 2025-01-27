package method2;

import java.util.Scanner;

public class UnitConverter {

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to select the conversion type
        System.out.println("Select the conversion type:");
        System.out.println("1. Kilometers to Miles");
        System.out.println("2. Miles to Kilometers");
        System.out.println("3. Meters to Feet");
        System.out.println("4. Feet to Meters");

        int choice = scanner.nextInt();

        double value;
        double result;

        switch (choice) {
            case 1:
                System.out.print("Enter value in Kilometers: ");
                value = scanner.nextDouble();
                result = convertKmToMiles(value);
                System.out.println(value + " kilometers is equal to " + result + " miles.");
                break;

            case 2:
                System.out.print("Enter value in Miles: ");
                value = scanner.nextDouble();
                result = convertMilesToKm(value);
                System.out.println(value + " miles is equal to " + result + " kilometers.");
                break;

            case 3:
                System.out.print("Enter value in Meters: ");
                value = scanner.nextDouble();
                result = convertMetersToFeet(value);
                System.out.println(value + " meters is equal to " + result + " feet.");
                break;

            case 4:
                System.out.print("Enter value in Feet: ");
                value = scanner.nextDouble();
                result = convertFeetToMeters(value);
                System.out.println(value + " feet is equal to " + result + " meters.");
                break;

            default:
                System.out.println("Invalid choice. Please select a valid option.");
                break;
        }
    }
}

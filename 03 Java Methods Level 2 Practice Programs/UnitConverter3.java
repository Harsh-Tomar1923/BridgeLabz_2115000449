package method2;

import java.util.Scanner;

public class UnitConverter3{

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheit2celsius = (fahrenheit - 32) * 5 / 9;
        return fahrenheit2celsius;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsius2fahrenheit = (celsius * 9 / 5) + 32;
        return celsius2fahrenheit;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to select the conversion type
        System.out.println("Select the conversion type:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("3. Pounds to Kilograms");
        System.out.println("4. Kilograms to Pounds");
        System.out.println("5. Gallons to Liters");
        System.out.println("6. Liters to Gallons");

        int choice = scanner.nextInt();

        double value;
        double result;

        switch (choice) {
            case 1:
                System.out.print("Enter value in Fahrenheit: ");
                value = scanner.nextDouble();
                result = convertFahrenheitToCelsius(value);
                System.out.println(value + " Fahrenheit is equal to " + result + " Celsius.");
                break;

            case 2:
                System.out.print("Enter value in Celsius: ");
                value = scanner.nextDouble();
                result = convertCelsiusToFahrenheit(value);
                System.out.println(value + " Celsius is equal to " + result + " Fahrenheit.");
                break;

            case 3:
                System.out.print("Enter value in Pounds: ");
                value = scanner.nextDouble();
                result = convertPoundsToKilograms(value);
                System.out.println(value + " pounds is equal to " + result + " kilograms.");
                break;

            case 4:
                System.out.print("Enter value in Kilograms: ");
                value = scanner.nextDouble();
                result = convertKilogramsToPounds(value);
                System.out.println(value + " kilograms is equal to " + result + " pounds.");
                break;

            case 5:
                System.out.print("Enter value in Gallons: ");
                value = scanner.nextDouble();
                result = convertGallonsToLiters(value);
                System.out.println(value + " gallons is equal to " + result + " liters.");
                break;

            case 6:
                System.out.print("Enter value in Liters: ");
                value = scanner.nextDouble();
                result = convertLitersToGallons(value);
                System.out.println(value + " liters is equal to " + result + " gallons.");
                break;

            default:
                System.out.println("Invalid choice. Please select a valid option.");
                break;
        }
    }
}

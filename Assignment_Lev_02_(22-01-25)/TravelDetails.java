package level2;

import java.util.Scanner;

public class TravelDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input details about the user and travel
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the starting city (fromCity): ");
        String fromCity = scanner.nextLine();

        System.out.print("Enter the via city (viaCity): ");
        String viaCity = scanner.nextLine();

        System.out.print("Enter the destination city (toCity): ");
        String toCity = scanner.nextLine();

        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in miles: ");
        double fromToVia = scanner.nextDouble();

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in miles: ");
        double viaToFinalCity = scanner.nextDouble();

        System.out.print("Enter the total time taken for the journey in hours: ");
        double timeTaken = scanner.nextDouble();

        // Calculate the total distance
        double totalDistance = fromToVia + viaToFinalCity;

        // Calculate average speed
        double averageSpeed = totalDistance / timeTaken;

        // Output the results
        System.out.println("\nTravel Details:");
        System.out.println("Name: " + name);
        System.out.println("From City: " + fromCity);
        System.out.println("Via City: " + viaCity);
        System.out.println("To City: " + toCity);
        System.out.println("Total Distance: " + totalDistance + " miles");
        System.out.println("Time Taken: " + timeTaken + " hours");
        System.out.println("Average Speed: " + averageSpeed + " miles/hour");

    }
}

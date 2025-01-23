package Array2;

import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numPersons = sc.nextInt();

        // Create arrays to store weight, height, BMI, and weight status
        double[] weights = new double[numPersons];
        double[] heights = new double[numPersons];
        double[] bmis = new double[numPersons];
        String[] weightStatuses = new String[numPersons];

        // Take input for the weight and height of each person
        for (int i = 0; i < numPersons; i++) {
            System.out.print("Enter the weight (in kg) of person " + (i + 1) + ": ");
            weights[i] = sc.nextDouble();
            System.out.print("Enter the height (in meters) of person " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
        }

        // Calculate BMI and determine weight status for each person
        for (int i = 0; i < numPersons; i++) {
            // Calculate BMI (BMI = weight / (height * height))
            bmis[i] = weights[i] / (heights[i] * heights[i]);

            // Determine the weight status based on BMI
            if (bmis[i] <= 18.4) {
                weightStatuses[i] = "Underweight";
            } else if (bmis[i] >= 18.5 && bmis[i] <= 24.9) {
                weightStatuses[i] = "Normal";
            } else if (bmis[i] >= 25.0 && bmis[i] <= 39.9) {
                weightStatuses[i] = "Overweight";
            } else {
                weightStatuses[i] = "Obese";
            }
        }

        // Display the height, weight, BMI, and weight status of each person
        System.out.println("\nPerson Details:");
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Height: " + heights[i] + " meters");
            System.out.println("Weight: " + weights[i] + " kg");
            System.out.println("BMI: " + bmis[i]);
            System.out.println("Weight Status: " + weightStatuses[i]);
            System.out.println("-------------------------------------------------");
        }
    }
}

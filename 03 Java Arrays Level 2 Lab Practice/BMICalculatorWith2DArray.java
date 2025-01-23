package Array2;

import java.util.Scanner;

public class BMICalculatorWith2DArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int number = sc.nextInt();

        // Create a 2D array to store weight, height, and BMI
        double[][] personData = new double[number][3]; // 3 columns: [weight, height, BMI]
        String[] weightStatus = new String[number];

        // Take input for weight and height of each person
        for (int i = 0; i < number; i++) {
            // Get weight input
            do {
                System.out.print("Enter the weight (in kg) of person " + (i + 1) + ": ");
                personData[i][0] = sc.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Weight must be a positive value. Please enter again.");
                }
            } while (personData[i][0] <= 0);

            // Get height input
            do {
                System.out.print("Enter the height (in meters) of person " + (i + 1) + ": ");
                personData[i][1] = sc.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Height must be a positive value. Please enter again.");
                }
            } while (personData[i][1] <= 0);
        }

        // Calculate BMI and determine weight status for each person
        for (int i = 0; i < number; i++) {
            // Calculate BMI (BMI = weight / (height * height))
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            // Determine the weight status based on BMI
            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] >= 25.0 && personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display the height, weight, BMI, and weight status of each person
        System.out.println("\nPerson Details:");
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Height: " + personData[i][1] + " meters");
            System.out.println("Weight: " + personData[i][0] + " kg");
            System.out.println("BMI: " + personData[i][2]);
            System.out.println("Weight Status: " + weightStatus[i]);
            System.out.println("-------------------------------------------------");
        }
    }
}

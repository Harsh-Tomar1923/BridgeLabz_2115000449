package method2;

import java.util.Scanner;

public class BMIProgram {

    // Method to calculate BMI for each person
    public static double calculateBMI(double weight, double heightInCm) {
        double heightInM = heightInCm / 100; // Convert height from cm to meters
        return weight / (heightInM * heightInM); // BMI formula
    }

    // Method to determine the BMI status
    public static String getBMIStatus(double bmi) {
        if (bmi <= 18.4) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 2D array to store weight (kg), height (cm), and BMI
        double[][] personData = new double[10][3]; // 10 persons, 3 columns (weight, height, BMI)

        // Input for 10 persons' weight and height
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            personData[i][0] = scanner.nextDouble();

            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            personData[i][1] = scanner.nextDouble();

            // Calculate BMI and store it in the third column of the array
            personData[i][2] = calculateBMI(personData[i][0], personData[i][1]);
        }

        // Print the BMI results and status for all persons
        System.out.println("\nBMI and Status for each person:");
        System.out.println("Person | Weight (kg) | Height (cm) | BMI | Status");
        for (int i = 0; i < 10; i++) {
            String status = getBMIStatus(personData[i][2]);
            System.out.printf("%6d | %11.2f | %12.2f | %.2f | %s\n",
                    (i + 1), personData[i][0], personData[i][1], personData[i][2], status);
        }
    }
}

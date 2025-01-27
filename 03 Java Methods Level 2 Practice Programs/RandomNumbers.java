package method2;

import java.util.Arrays;

public class RandomNumbers {

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            // Generate a 4-digit random number (between 1000 and 9999)
            randomNumbers[i] = (int) (Math.random() * 9000) + 1000;
        }
        return randomNumbers;
    }

    // Method to find the average, min, and max values of an array
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        double sum = 0;

        // Loop through the array to find sum, min, and max
        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = sum / numbers.length;
        return new double[] { average, min, max };
    }

    public static void main(String[] args) {
        // Generate an array of 5 random 4-digit numbers
        int[] randomNumbers = generate4DigitRandomArray(5);

        // Display the generated random numbers
        System.out.println("Generated 4-digit random numbers: " + Arrays.toString(randomNumbers));

        // Find the average, min, and max values
        double[] result = findAverageMinMax(randomNumbers);

        // Display the results
        System.out.println("Average: " + result[0]);
        System.out.println("Minimum value: " + result[1]);
        System.out.println("Maximum value: " + result[2]);
    }
}

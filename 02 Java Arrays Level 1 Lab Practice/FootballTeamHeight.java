package array1;

import java.util.Scanner;

public class FootballTeamHeight{
    public static void main(String[] args) {
        // Create a double array of size 11
        double[] heights = new double[11];

        // Scanner to get input from user
        Scanner sc = new Scanner(System.in);

        // Get heights of all players
        System.out.println("Enter the heights of the 11 players:");
        double sum = 0;
        for (int i = 0; i < 11; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
            sum += heights[i];  // Add each player's height to sum
        }

        // Calculate the mean height
        double mean = sum / 11;

        // Print the mean height
        System.out.println("The mean height of the football team is: " + mean);
    }
}

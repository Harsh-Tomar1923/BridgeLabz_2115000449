package Array2;

import java.util.Scanner;

public class YoungestTallestFriends {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Arrays to store age and height of the 3 friends
        int[] ages = new int[3];
        double[] heights = new double[3];
        String[] friends = {"Amar", "Akbar", "Anthony"};

        // Taking input for age and height of each friend
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + friends[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + friends[i] + " (in meters): ");
            heights[i] = sc.nextDouble();
        }

        // Finding the youngest and tallest friend
        int youngestAge = ages[0];
        int youngestIndex = 0;
        double tallestHeight = heights[0];
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                youngestIndex = i;
            }
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                tallestIndex = i;
            }
        }

        // Display the youngest and tallest friends
        System.out.println("\nYoungest Friend: " + friends[youngestIndex] + " (Age: " + youngestAge + ")");
        System.out.println("Tallest Friend: " + friends[tallestIndex] + " (Height: " + tallestHeight + " meters)");
    }
}

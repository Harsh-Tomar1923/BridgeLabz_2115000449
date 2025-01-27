package method2;

import java.util.Scanner;

public class FriendComparison {

    // Method to find the youngest friend
    public static String findYoungest(int[] ages, String[] names) {
        int minAge = ages[0];
        String youngestFriend = names[0];

        // Compare each friend's age to find the youngest
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngestFriend = names[i];
            }
        }
        return youngestFriend;
    }

    // Method to find the tallest friend
    public static String findTallest(int[] heights, String[] names) {
        int maxHeight = heights[0];
        String tallestFriend = names[0];

        // Compare each friend's height to find the tallest
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallestFriend = names[i];
            }
        }
        return tallestFriend;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Names of the three friends
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Arrays to store the ages and heights of the friends
        int[] ages = new int[3];
        int[] heights = new int[3];

        // Take user input for the age and height of each friend
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the age of " + names[i] + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter the height of " + names[i] + " (in cm): ");
            heights[i] = scanner.nextInt();
        }

        // Find and display the youngest and tallest friends
        String youngest = findYoungest(ages, names);
        String tallest = findTallest(heights, names);

        System.out.println("\nThe youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);
    }
}

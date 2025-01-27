package method3;

import java.util.Random;

public class FootballTeam {

    // Method to generate random heights between 150 and 250 cm
    public static int[] generateRandomHeights(int size) {
        int[] heights = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            // Generate random height between 150 and 250 cm
            heights[i] = random.nextInt(101) + 150;  // Random value between 150 and 250 inclusive
        }
        return heights;
    }

    // Method to find the sum of all the heights in the array
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to find the mean height
    public static double findMeanHeight(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    // Method to find the shortest height
    public static int findShortestHeight(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            shortest = Math.min(shortest, height);
        }
        return shortest;
    }

    // Method to find the tallest height
    public static int findTallestHeight(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            tallest = Math.max(tallest, height);
        }
        return tallest;
    }

    public static void main(String[] args) {
        // Generate an array of random heights for 11 players
        int[] heights = generateRandomHeights(11);

        // Display the generated heights
        System.out.println("Heights of football players: ");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();

        // Calculate the sum, mean, shortest, and tallest heights
        int sum = findSum(heights);
        double meanHeight = findMeanHeight(heights);
        int shortestHeight = findShortestHeight(heights);
        int tallestHeight = findTallestHeight(heights);

        // Display the results
        System.out.println("Sum of heights: " + sum + " cm");
        System.out.println("Mean height: " + meanHeight + " cm");
        System.out.println("Shortest height: " + shortestHeight + " cm");
        System.out.println("Tallest height: " + tallestHeight + " cm");
    }
}

package Extras;

import java.util.Random;
import java.util.Scanner;

class NumberGuessingGame {
    public static int generateGuess(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

    public static String getUserFeedback(int guess) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Is the number " + guess + "? (high/low/correct): ");
        return sc.nextLine().toLowerCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Think of a number between 1 and 100. Press Enter when you're ready.");
        sc.nextLine();

        int min = 1, max = 100;
        String feedback = "";
        while (!feedback.equals("correct")) {
            int guess = generateGuess(min, max);
            feedback = getUserFeedback(guess);
            if (feedback.equals("high")) {
                max = guess - 1;
            } else if (feedback.equals("low")) {
                min = guess + 1;
            }
        }
        System.out.println("Yay! I guessed your number!");
    }
}

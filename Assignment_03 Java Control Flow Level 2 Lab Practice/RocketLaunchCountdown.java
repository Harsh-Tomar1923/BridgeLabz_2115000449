package four;

import java.util.Scanner;

public class RocketLaunchCountdown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the countdown starting value
        System.out.print("Enter the countdown starting value: ");
        int counter = scanner.nextInt();

        // Check if the counter is a positive number
        if (counter <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        // Countdown loop
        while (counter >= 1) {
            System.out.println("T-" + counter);
            counter--;  // Decrement the counter
        }

        // Final message after countdown ends
        System.out.println("Liftoff!");
    }
}

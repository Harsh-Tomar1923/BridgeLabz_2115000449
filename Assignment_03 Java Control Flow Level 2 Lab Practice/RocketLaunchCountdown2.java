package four;

import java.util.Scanner;

public class RocketLaunchCountdown2 {
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

        // Countdown loop using for-loop
        for (int i = counter; i >= 1; i--) {
            System.out.println("T-" + i);
        }

        // Final message after countdown ends
        System.out.println("Liftoff!");
    }
}

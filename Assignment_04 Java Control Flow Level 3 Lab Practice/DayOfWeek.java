package five;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        // Input: Get the month, day, and year from the user (command-line arguments)
        Scanner scanner = new Scanner(System.in);

        // Prompt for date components
        System.out.print("Enter month (1-12): ");
        int m = scanner.nextInt();

        System.out.print("Enter day (1-31): ");
        int d = scanner.nextInt();

        System.out.print("Enter year: ");
        int y = scanner.nextInt();

        // Step 1: Apply the formula for calculating the day of the week
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;

        // Step 2: Output the result as per the formula
        System.out.println("The day of the week is: " + d0);

        // Mapping the result to the correct day
        switch (d0) {
            case 0: System.out.println("0 = Sunday"); break;
            case 1: System.out.println("1 = Monday"); break;
            case 2: System.out.println("2 = Tuesday"); break;
            case 3: System.out.println("3 = Wednesday"); break;
            case 4: System.out.println("4 = Thursday"); break;
            case 5: System.out.println("5 = Friday"); break;
            case 6: System.out.println("6 = Saturday"); break;
            default: System.out.println("Invalid day.");
        }
    }
}

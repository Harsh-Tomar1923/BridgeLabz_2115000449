package three;

import java.util.Scanner;

public class LeapYearSingleIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input year
        System.out.print("Enter a year (>= 1582): ");
        int year = scanner.nextInt();

        // Using a single if condition
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " is a Leap Year.");
        } else if (year < 1582) {
            System.out.println("Year must be >= 1582.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
    }
}

package method3;

import java.util.Scanner;

public class CalendarDisplay {

    // Method to get the name of the month
    public static String getMonthName(int month) {
        String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];  // Since month is 1-based
    }

    // Method to check if the year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the number of days in the month
    public static int getDaysInMonth(int month, int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            return 29;  // February has 29 days in a leap year
        }
        return daysInMonth[month - 1];
    }

    // Method to calculate the first day of the month (Gregorian calendar algorithm)
    public static int getFirstDayOfMonth(int month, int year) {
        int y = year;
        int m = month;

        if (m < 3) {
            m += 12;
            y -= 1;
        }

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7;  // 1st day of the month

        return d0;
    }

    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        int daysInMonth = getDaysInMonth(month, year);
        int firstDay = getFirstDayOfMonth(month, year);
        String monthName = getMonthName(month);

        System.out.printf("Calendar for %s %d\n", monthName, year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Print leading spaces for the first day of the month
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");  // 4 spaces for alignment
        }

        // Print days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);

            // Move to the next line after Saturday
            if ((firstDay + day) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println(); // Move to the next line after the last day
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take month and year as input from the user
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        // Validate month and year
        if (month < 1 || month > 12 || year < 0) {
            System.out.println("Invalid month or year. Please enter valid values.");
        } else {
            // Display the calendar for the given month and year
            displayCalendar(month, year);
        }
    }
}

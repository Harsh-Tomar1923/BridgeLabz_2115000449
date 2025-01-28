package extras2;

import java.time.LocalDate;

class DateArithmetic {
    public static void performDateArithmetic(LocalDate date) {
        LocalDate newDate = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
        System.out.println("Original Date: " + date);
        System.out.println("After Adding 7 Days, 1 Month, 2 Years, and Subtracting 3 Weeks: " + newDate);
    }

    public static void main(String[] args) {
        LocalDate inputDate = LocalDate.of(2023, 1, 1);  // Example input
        performDateArithmetic(inputDate);
    }
}

package extras2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class DateFormatting {
    public static void displayFormattedDate() {
        LocalDate currentDate = LocalDate.now();

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        System.out.println("Date in dd/MM/yyyy format: " + currentDate.format(formatter1));
        System.out.println("Date in yyyy-MM-dd format: " + currentDate.format(formatter2));
        System.out.println("Date in EEE, MMM dd, yyyy format: " + currentDate.format(formatter3));
    }

    public static void main(String[] args) {
        displayFormattedDate();
    }
}

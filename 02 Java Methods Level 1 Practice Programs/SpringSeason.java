package method1;

public class SpringSeason {

    // Method to check if the given date is in the spring season
    public static boolean isSpringSeason(int month, int day) {
        if ((month == 3 && day >= 20 && day <= 31) || // March 20 to 31
                (month == 4 && day >= 1 && day <= 30) ||  // April 1 to 30
                (month == 5 && day >= 1 && day <= 31) ||  // May 1 to 31
                (month == 6 && day >= 1 && day <= 20)) {  // June 1 to 20
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // Parsing command-line arguments
        if (args.length < 2) {
            System.out.println("Please provide both month and day as command-line arguments.");
            return;
        }

        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Checking if the date is in the spring season
        boolean result = isSpringSeason(month, day);

        // Printing the result
        if (result) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
    }
}

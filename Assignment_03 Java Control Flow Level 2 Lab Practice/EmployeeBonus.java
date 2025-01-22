package four;

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get salary and years of service from the user
        System.out.print("Enter the employee's salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter the employee's years of service: ");
        int yearsOfService = scanner.nextInt();

        // Check if the employee is eligible for a bonus
        if (yearsOfService > 5) {
            double bonus = 0.05 * salary; // 5% bonus
            System.out.println("The bonus amount is: " + bonus);
        } else {
            System.out.println("No bonus as the years of service are less than or equal to 5.");
        }
    }
}

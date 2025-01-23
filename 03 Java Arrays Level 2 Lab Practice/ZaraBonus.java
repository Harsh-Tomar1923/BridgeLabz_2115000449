package Array2;

import java.util.Scanner;

public class ZaraBonus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Arrays to store salary and years of service for 10 employees
        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];

        // Variables to calculate total bonus, total old salary, and total new salary
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Loop to take input for salary and years of service
        for (int i = 0; i < 10; i++) {
            boolean validInput = false;
            while (!validInput) {
                System.out.print("Enter salary of employee " + (i + 1) + ": ");
                salaries[i] = sc.nextDouble();

                System.out.print("Enter years of service for employee " + (i + 1) + ": ");
                yearsOfService[i] = sc.nextDouble();

                // Validation for salary and years of service
                if (salaries[i] > 0 && yearsOfService[i] >= 0) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input! Please enter valid salary and years of service.");
                }
            }
        }

        // Loop to calculate bonus, new salary, and total amounts
        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonuses[i] = salaries[i] * 0.05;  // 5% bonus if years of service > 5
            } else {
                bonuses[i] = salaries[i] * 0.02;  // 2% bonus if years of service <= 5
            }
            newSalaries[i] = salaries[i] + bonuses[i];
            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        // Print total bonus, total old salary, and total new salary
        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}

package method3;

import java.util.Random;

public class EmployeeBonusCalculator {

    // Method to generate random salaries and years of service for 10 employees
    public static int[][] generateEmployeeData(int size) {
        Random random = new Random();
        int[][] employeeData = new int[size][2];

        for (int i = 0; i < size; i++) {
            employeeData[i][0] = 30000 + random.nextInt(70001); // Salary between 30,000 and 100,000
            employeeData[i][1] = random.nextInt(11); // Years of service between 0 and 10
        }

        return employeeData;
    }

    // Method to calculate the new salary and bonus for each employee
    public static double[][] calculateBonusAndNewSalary(int[][] employeeData) {
        double[][] newData = new double[employeeData.length][2];

        for (int i = 0; i < employeeData.length; i++) {
            double bonusPercentage = employeeData[i][1] > 5 ? 0.05 : 0.02;
            double bonus = employeeData[i][0] * bonusPercentage;
            double newSalary = employeeData[i][0] + bonus;

            newData[i][0] = bonus;
            newData[i][1] = newSalary;
        }

        return newData;
    }

    // Method to calculate totals and display in tabular format
    public static void displayBonusSummary(int[][] employeeData, double[][] bonusData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        System.out.println("Emp#\tOld Salary\tYears of Service\tBonus\t\tNew Salary");
        for (int i = 0; i < employeeData.length; i++) {
            System.out.printf("%d\t%d\t\t%d\t\t\t%.2f\t\t%.2f\n",
                    i + 1, employeeData[i][0], employeeData[i][1], bonusData[i][0], bonusData[i][1]);

            totalOldSalary += employeeData[i][0];
            totalBonus += bonusData[i][0];
            totalNewSalary += bonusData[i][1];
        }

        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);
    }

    public static void main(String[] args) {
        int[][] employeeData = generateEmployeeData(10);
        double[][] bonusData = calculateBonusAndNewSalary(employeeData);
        displayBonusSummary(employeeData, bonusData);
    }
}

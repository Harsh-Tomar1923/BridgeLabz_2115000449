package BL;

import java.util.Scanner;

public class DiscountCalculatorWithInput {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Taking the input
        System.out.print("Enter the student fee: INR ");
        int fee = input.nextInt();

        // Taking the input
        System.out.print("Enter the discount percentage: ");
        int discountPercent = input.nextInt();

        // Calculate the discount and final fee
        int discount = (fee * discountPercent) / 100;
        int discountedFee = fee - discount;

        // Printing the results
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
    }
}

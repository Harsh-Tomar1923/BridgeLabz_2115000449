package BL;

public class DiscountCalculator {
    public static void main(String[] args) {
        // Define variables
        int fee = 125000;
        int discountPercent = 10;

        // Calculating discount and final fee
        int discount = (fee * discountPercent) / 100;
        int discountedFee = fee - discount;

        // Printing the result
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
    }
}

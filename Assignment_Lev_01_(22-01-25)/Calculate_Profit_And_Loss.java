package BL;
public class Calculate_Profit_And_Loss {
    public static void main(String[] args) {
        // Enter Cost Price
        int costPrice=129;

        // Enter Selling Price
        int sellingPrice=191;

        //Calculating Profit
        int profit= sellingPrice-costPrice;

        // Calculating Profit percentage
        int profitPercentage=(profit*100)/costPrice;

        //Printing the result
        System.out.println("The Cost Price is INR 129 and Selling Price is INR 191");
        System.out.println("The Profit is INR "+ profit+" and the Profit Percentage is: "+ profitPercentage+"%");
    }
}

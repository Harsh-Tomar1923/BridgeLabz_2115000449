package method1;

import java.util.Scanner;

public class ChocolateDistribution {

    // Method to find the chocolates each child gets and the remaining chocolates
    public static int[] findChocolates(int numberOfChocolates, int numberOfChildren) {
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;
        return new int[]{chocolatesPerChild, remainingChocolates};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the number of chocolates and number of children
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        // Calling the method to find chocolates per child and remaining chocolates
        int[] result = findChocolates(numberOfChocolates, numberOfChildren);

        // Displaying the result
        System.out.println("Each child will get " + result[0] + " chocolates.");
        System.out.println("The remaining chocolates are: " + result[1]);
    }
}

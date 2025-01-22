package level2;
import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input numbers
        System.out.print("Enter the first number (number1): ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number (number2): ");
        int number2 = scanner.nextInt();

        // Display original numbers
        System.out.println("Before swapping: number1 = " + number1 + ", number2 = " + number2);

        // Swap the numbers
        int temp = number1;
        number1 = number2;
        number2 = temp;

        // Display swapped numbers
        System.out.println("The swapped numbers are number1 = " + number1 + " and number2 = " + number2);
    }
}


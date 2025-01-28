package Extras;

import java.util.Scanner;

class MaximumOfThree {
    public static int findMax(int num1, int num2, int num3) {
        int max = num1;
        if (num2 > max) max = num2;
        if (num3 > max) max = num3;
        return max;
    }

    public static int getInput(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextInt();
    }

    public static void main(String[] args) {
        int num1 = getInput("Enter the first number: ");
        int num2 = getInput("Enter the second number: ");
        int num3 = getInput("Enter the third number: ");
        System.out.println("The maximum number is: " + findMax(num1, num2, num3));
    }
}

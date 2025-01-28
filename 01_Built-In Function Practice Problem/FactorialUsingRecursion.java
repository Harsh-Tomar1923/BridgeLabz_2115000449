package Extras;

import java.util.Scanner;

class FactorialUsingRecursion {
    public static int calculateFactorial(int num) {
        if (num == 0) return 1;
        return num * calculateFactorial(num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Factorial of " + num + " is: " + calculateFactorial(num));
    }
}

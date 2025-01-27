package method3;

public class NumberChecker4 {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Prime numbers are greater than 1
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Divisible by another number means it's not prime
            }
        }
        return true; // If no divisors found, it's prime
    }

    // Method to check if a number is a neon number
    public static boolean isNeonNumber(int number) {
        int square = number * number;
        int sumOfDigits = 0;
        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        return sumOfDigits == number; // Neon number condition
    }

    // Method to check if a number is a spy number
    public static boolean isSpyNumber(int number) {
        int sum = 0, product = 1;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        return sum == product; // Spy number condition
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphicNumber(int number) {
        int square = number * number;
        int temp = number;
        while (temp > 0) {
            if (square % 10 != temp % 10) {
                return false; // If the last digit of square doesn't match number, it's not automorphic
            }
            square /= 10;
            temp /= 10;
        }
        return true; // If the number is automorphic
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzzNumber(int number) {
        return (number % 7 == 0 || number % 10 == 7); // Buzz number condition
    }

    public static void main(String[] args) {
        int number = 25;  // Example number

        // Check if the number is prime
        boolean prime = isPrime(number);
        System.out.println("Is Prime? " + prime);

        // Check if the number is a neon number
        boolean neon = isNeonNumber(number);
        System.out.println("Is Neon Number? " + neon);

        // Check if the number is a spy number
        boolean spy = isSpyNumber(number);
        System.out.println("Is Spy Number? " + spy);

        // Check if the number is an automorphic number
        boolean automorphic = isAutomorphicNumber(number);
        System.out.println("Is Automorphic Number? " + automorphic);

        // Check if the number is a buzz number
        boolean buzz = isBuzzNumber(number);
        System.out.println("Is Buzz Number? " + buzz);
    }
}

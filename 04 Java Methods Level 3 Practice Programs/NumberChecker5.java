package method3;

public class NumberChecker5 {

    // Method to find factors of a number and return them as an array
    public static int[] findFactors(int number) {
        int[] factors = new int[number]; // Temporary array to store factors
        int count = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                factors[count] = i;
                count++;
            }
        }
        int[] result = new int[count]; // Array to store only the factors
        System.arraycopy(factors, 0, result, 0, count);
        return result;
    }

    // Method to find the greatest factor of a number
    public static int findGreatestFactor(int[] factors) {
        int greatestFactor = factors[0];
        for (int factor : factors) {
            if (factor > greatestFactor) {
                greatestFactor = factor;
            }
        }
        return greatestFactor;
    }

    // Method to find the sum of the factors of a number
    public static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors of a number
    public static int findProductOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of the cubes of the factors of a number
    public static double findProductOfCubesOfFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3); // Cube each factor
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int[] factors = findFactors(number);
        int sum = findSumOfFactors(factors);
        return sum == number; // A perfect number is equal to the sum of its proper divisors
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        int[] factors = findFactors(number);
        int sum = findSumOfFactors(factors);
        return sum > number; // An abundant number has divisors sum greater than the number itself
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        int[] factors = findFactors(number);
        int sum = findSumOfFactors(factors);
        return sum < number; // A deficient number has divisors sum less than the number itself
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int sumOfFactorials = 0;
        int tempNumber = number;
        while (tempNumber > 0) {
            int digit = tempNumber % 10;
            sumOfFactorials += factorial(digit);
            tempNumber /= 10;
        }
        return sumOfFactorials == number; // A strong number equals the sum of factorials of its digits
    }

    // Helper method to calculate factorial of a number
    private static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 145; // Example number

        // Find factors of the number
        int[] factors = findFactors(number);
        System.out.print("Factors of " + number + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Find greatest factor
        int greatestFactor = findGreatestFactor(factors);
        System.out.println("Greatest Factor: " + greatestFactor);

        // Find sum of factors
        int sumOfFactors = findSumOfFactors(factors);
        System.out.println("Sum of Factors: " + sumOfFactors);

        // Find product of factors
        int productOfFactors = findProductOfFactors(factors);
        System.out.println("Product of Factors: " + productOfFactors);

        // Find product of cubes of factors
        double productOfCubes = findProductOfCubesOfFactors(factors);
        System.out.println("Product of Cubes of Factors: " + productOfCubes);

        // Check if the number is perfect
        boolean perfect = isPerfectNumber(number);
        System.out.println("Is Perfect Number? " + perfect);

        // Check if the number is abundant
        boolean abundant = isAbundantNumber(number);
        System.out.println("Is Abundant Number? " + abundant);

        // Check if the number is deficient
        boolean deficient = isDeficientNumber(number);
        System.out.println("Is Deficient Number? " + deficient);

        // Check if the number is strong
        boolean strong = isStrongNumber(number);
        System.out.println("Is Strong Number? " + strong);
    }
}
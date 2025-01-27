package method1;

import java.util.Scanner;

public class MaximumHandshakes2 {

    // Method to calculate the maximum number of handshakes
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Calling the method to calculate the number of handshakes
        int maxHandshakes = calculateHandshakes(numberOfStudents);

        // Displaying the result
        System.out.println("The maximum number of handshakes among " + numberOfStudents +
                " students is: " + maxHandshakes);
    }
}

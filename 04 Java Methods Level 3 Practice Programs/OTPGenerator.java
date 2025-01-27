package method3;

import java.util.HashSet;

public class OTPGenerator {

    // Method to generate a 6-digit OTP number using Math.random()
    public static int generateOTP() {
        // Generate a random number between 100000 and 999999 (inclusive)
        return (int) (Math.random() * 900000) + 100000;
    }

    // Method to ensure that the OTP numbers generated are unique
    public static boolean areOTPsUnique(int[] otps) {
        // Using a HashSet to store OTPs to check for uniqueness
        HashSet<Integer> otpSet = new HashSet<>();
        for (int otp : otps) {
            if (!otpSet.add(otp)) {
                // If add returns false, it means the OTP already exists in the set (i.e., not unique)
                return false;
            }
        }
        return true; // All OTPs are unique
    }

    public static void main(String[] args) {
        int[] otpArray = new int[10]; // Array to store 10 OTPs

        // Generate 10 OTPs and store them in the array
        for (int i = 0; i < 10; i++) {
            otpArray[i] = generateOTP();
            System.out.println("Generated OTP " + (i + 1) + ": " + otpArray[i]);
        }

        // Check if all the OTPs are unique
        boolean unique = areOTPsUnique(otpArray);

        if (unique) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Some OTPs are not unique.");
        }
    }
}

package BL_String;

import java.util.Scanner;

class StringComparator {
    public static void compareStrings(String str1, String str2) {
        if (str1.compareTo(str2) < 0) {
            System.out.println(str1 + " comes before " + str2 + " lexicographically.");
        } else if (str1.compareTo(str2) > 0) {
            System.out.println(str1 + " comes after " + str2 + " lexicographically.");
        } else {
            System.out.println("Both strings are equal.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();
        compareStrings(str1, str2);
    }
}

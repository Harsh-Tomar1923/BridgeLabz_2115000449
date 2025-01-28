package BL_String;

import java.util.Scanner;

class SubstringCounter {
    public static int countSubstring(String str, String sub) {
        int count = 0, index = 0;
        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String str = sc.nextLine();
        System.out.print("Enter the substring: ");
        String sub = sc.nextLine();
        System.out.println("Occurrences: " + countSubstring(str, sub));
    }
}

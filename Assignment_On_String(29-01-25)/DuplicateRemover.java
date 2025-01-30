package BL_String;

import java.util.Scanner;

class DuplicateRemover {
    public static String removeDuplicates(String str) {
        String result = "";
        boolean[] seen = new boolean[256];
        for (char c : str.toCharArray()) {
            if (!seen[c]) {
                seen[c] = true;
                result += c;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.println("String after removing duplicates: " + removeDuplicates(input));
        sc.close();
    }
}

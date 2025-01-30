package BL_String;

import java.util.Scanner;

class SpecificCharacterRemover {
    public static String removeCharacter(String str, char ch) {
        String result = "";
        for (char c : str.toCharArray()) {
            if (c != ch) {
                result += c;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.print("Enter the character to remove: ");
        char ch = sc.next().charAt(0);
        System.out.println("Modified String: " + removeCharacter(input, ch));
        sc.close();
    }
}

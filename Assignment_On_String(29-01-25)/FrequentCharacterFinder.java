package BL_String;
import java.util.Scanner;

class FrequentCharacterFinder {
    public static char findMostFrequentChar(String str) {
        int[] freq = new int[256];
        for (char c : str.toCharArray()) {
            freq[c]++;
        }

        char mostFrequent = ' ';
        int maxCount = 0;
        for (char c : str.toCharArray()) {
            if (freq[c] > maxCount) {
                maxCount = freq[c];
                mostFrequent = c;
            }
        }
        return mostFrequent;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.println("Most Frequent Character: '" + findMostFrequentChar(input) + "'");
        sc.close();
    }
}

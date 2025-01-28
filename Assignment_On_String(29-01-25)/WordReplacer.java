package BL_String;

import java.util.Scanner;

class WordReplacer {
    public static String replaceWord(String sentence, String target, String replacement) {
        return sentence.replace(target, replacement);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        System.out.print("Enter the word to replace: ");
        String target = sc.nextLine();
        System.out.print("Enter the replacement word: ");
        String replacement = sc.nextLine();
        System.out.println("Modified Sentence: " + replaceWord(sentence, target, replacement));
    }
}

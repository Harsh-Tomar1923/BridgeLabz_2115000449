package BL;

public class SamAverageMarks {
    public static void main(String[] args) {
        // Entering physics marks
        int physics=95;

        // Entering chemistry marks
        int chem=96;

        // Entering Maths marks
        int maths=94;

        // calculating average percentage of PCM
        double avgPercentage= (double) ((95 + 96 + 94) * 100) /300;

        // printing the result
        System.out.println("Sam’s average mark in PCM is: "+avgPercentage+"%");
    }
}

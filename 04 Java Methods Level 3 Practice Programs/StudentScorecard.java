package method3;

import java.util.Random;

public class StudentScorecard {

    // Method to generate random PCM scores for students
    public static int[][] generateStudentScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = 40 + random.nextInt(61); // Physics score between 40 and 100
            scores[i][1] = 40 + random.nextInt(61); // Chemistry score between 40 and 100
            scores[i][2] = 40 + random.nextInt(61); // Math score between 40 and 100
        }

        return scores;
    }

    // Method to calculate total, average, percentage, and grade
    public static String[][] calculateScorecard(int[][] scores) {
        String[][] scorecard = new String[scores.length][5];

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Determine grade
            String grade;
            if (percentage >= 80) grade = "A";
            else if (percentage >= 70) grade = "B";
            else if (percentage >= 60) grade = "C";
            else if (percentage >= 50) grade = "D";
            else if (percentage >= 40) grade = "E";
            else grade = "R";

            // Store results
            scorecard[i][0] = String.valueOf(total);
            scorecard[i][1] = String.format("%.2f", average);
            scorecard[i][2] = String.format("%.2f", percentage);
            scorecard[i][3] = grade;
        }

        return scorecard;
    }

    // Method to display the scorecard
    public static void displayScorecard(int[][] scores, String[][] scorecard) {
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%s\t%s\t%s\t\t%s\n",
                    i + 1, scores[i][0], scores[i][1], scores[i][2],
                    scorecard[i][0], scorecard[i][1], scorecard[i][2], scorecard[i][3]);
        }
    }

    public static void main(String[] args) {
        int numStudents = 5; // Number of students
        int[][] scores = generateStudentScores(numStudents);
        String[][] scorecard = calculateScorecard(scores);
        displayScorecard(scores, scorecard);
    }
}

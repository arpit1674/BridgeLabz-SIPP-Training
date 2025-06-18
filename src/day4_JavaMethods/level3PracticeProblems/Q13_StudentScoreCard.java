package day4_JavaMethods.level3PracticeProblems;
import java.util.Scanner;

public class Q13_StudentScoreCard {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();    
        int[][] scores = generateScores(n);
        double[][] results = calculateResults(scores);

        displayScorecard(scores, results);

        sc.close();
    }

    public static int[][] generateScores(int n) {
        int[][] scores = new int[n][3]; 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = (int) (Math.random() * 51 + 50); 
            }
        }
        return scores;
    }

   
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3]; 
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = avg; // max marks = 100 per subject

            results[i][0] = total;
            results[i][1] = Math.round(avg * 100.0) / 100.0;
            results[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return results;
    }

    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("ID\tPhy\tChem\tMath\tTotal\tAvg\t%\t");
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "\t" +
                scores[i][0] + "\t" +
                scores[i][1] + "\t" +
                scores[i][2] + "\t" +
                (int) results[i][0] + "\t" +
                results[i][1] + "\t" +
                results[i][2]);
        }
    }
}
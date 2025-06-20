package EXTRAS_built_in_functions;

import java.util.Scanner;
import java.util.Random;

public class Problem5_NumberGuessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100;
        while (true) {
            int guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "? (Enter: high / low / correct)");
            String feedback = sc.nextLine();

            if (feedback.equals("correct")) {
                System.out.println("Guessed it!");
                break;
            } else if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            }
            sc.close();        }
    }

    static int generateGuess(int low, int high) {
        Random rand = new Random();
        return rand.nextInt(high - low + 1) + low;
    }
}

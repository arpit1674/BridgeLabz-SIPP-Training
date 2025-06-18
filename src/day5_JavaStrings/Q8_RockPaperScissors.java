package day5_JavaStrings;
import java.util.Scanner;

public class Q8_RockPaperScissors {
    public static int getComputerChoice() {
        return (int)(Math.random() * 3);
    }

    public static String getWinner(int user, int comp) {
        if (user == comp) return "Draw";
        if ((user == 0 && comp == 2) || (user == 1 && comp == 0) || (user == 2 && comp == 1)) return "User";
        return "Computer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int games = sc.nextInt();
        int userWins = 0, compWins = 0, draws = 0;
        for (int i = 0; i < games; i++) {
            int user = sc.nextInt();
            int comp = getComputerChoice();
            String result = getWinner(user, comp);
            if (result.equals("User")) userWins++;
            else if (result.equals("Computer")) compWins++;
            else draws++;
            System.out.println("Game " + (i + 1) + ": " + result);
        }
        System.out.println("User Wins: " + userWins);
        System.out.println("Computer Wins: " + compWins);
        System.out.println("Draws: " + draws);
        System.out.printf("User Win %%: %.2f\n", (userWins * 100.0 / games));
        System.out.printf("Computer Win %%: %.2f\n", (compWins * 100.0 / games));
        sc.close();
    }
}

package StringPractices.level2;
import java.util.Scanner;

class RockPaperScissors {

    // computer picks randomly from 0=Rock, 1=Paper, 2=Scissors
    public static String getComputerChoice() {
        int random = (int)(Math.random() * 3);
        if (random == 0) return "Rock";
        else if (random == 1) return "Paper";
        else return "Scissors";
    }

    public static String findWinner(String player, String computer) {
        if (player.equals(computer)) return "Draw";
        if ((player.equals("Rock") && computer.equals("Scissors")) ||
                (player.equals("Scissors") && computer.equals("Paper")) ||
                (player.equals("Paper") && computer.equals("Rock"))) {
            return "Player";
        }
        return "Computer";
    }

    // calculating win percentage for both sides
    public static String[][] getStats(int playerWins, int computerWins, int totalGames) {
        int draws = totalGames - playerWins - computerWins;
        double playerPercent = Math.round(((double) playerWins / totalGames) * 10000) / 100.0;
        double computerPercent = Math.round(((double) computerWins / totalGames) * 10000) / 100.0;
        return new String[][]{
                {"Player", String.valueOf(playerWins), String.valueOf(playerPercent) + "%"},
                {"Computer", String.valueOf(computerWins), String.valueOf(computerPercent) + "%"},
                {"Draws", String.valueOf(draws), "-"}
        };
    }

    public static void displayStats(String[][] stats) {
        System.out.println("\n--- Final Stats ---");
        System.out.println("Who\t\tWins\t\tWin%");
        System.out.println("--------------------------------");
        for (String[] row : stats) {
            System.out.println(row[0] + "\t\t" + row[1] + "\t\t" + row[2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many games do you want to play? ");
        int totalGames = sc.nextInt();

        int playerWins = 0;
        int computerWins = 0;

        for (int i = 1; i <= totalGames; i++) {
            System.out.print("\nGame " + i + " - Enter Rock, Paper, or Scissors: ");
            String playerChoice = sc.next();
            String computerChoice = getComputerChoice();
            String winner = findWinner(playerChoice, computerChoice);

            System.out.println("Computer chose: " + computerChoice);
            System.out.println("Winner: " + winner);

            if (winner.equals("Player")) playerWins++;
            else if (winner.equals("Computer")) computerWins++;
        }

        String[][] stats = getStats(playerWins, computerWins, totalGames);
        displayStats(stats);
    }
}
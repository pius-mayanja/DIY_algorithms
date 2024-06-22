package java;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter your choice (Rock, Paper, Scissors): ");
        String userChoice = scanner.nextLine();

        int computerChoiceNum = random.nextInt(3);
        String computerChoice = "";
        if (computerChoiceNum == 0) {
            computerChoice = "Rock";
        } else if (computerChoiceNum == 1) {
            computerChoice = "Paper";
        } else {
            computerChoice = "Scissors";
        }

        System.out.println("Computer chose: " + computerChoice);

        if (userChoice.equalsIgnoreCase(computerChoice)) {
            System.out.println("It's a tie!");
        } else if ((userChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Scissors")) ||
                   (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper")) ||
                   (userChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Rock"))) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
        scanner.close();

    }
}



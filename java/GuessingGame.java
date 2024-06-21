package java;
import java.util.*;

public class GuessingGame{
    int trials=0;

    static void StartGame(){
        System.out.println("Welcome to the Ultimate Guessing Game.\nAm thinking of a number between 1 and 100!\nTry guessing it....\n");

    }

    static void guessing(boolean guessed, int guessed_number, int right_number){
        
    }


    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        Random number = new Random();

        int right_number = number.nextInt(100);
        boolean Guessed = false;

        GuessingGame game = new GuessingGame();
        StartGame();

        while(!Guessed){
            System.out.print("Enter your Guess: ");
            int guessed_number = UserInput.nextInt();

            if (guessed_number > right_number){
                System.out.println("Too High! Try Again.....\n");
            }else if(guessed_number < right_number){
                System.out.println("Too Low! Try Again......\n");
            }else{
                System.out.println(" ");
                System.out.println("Congratulations! You've guessed the number in "+ game.trials+" attempts.");
                System.out.println("The right number was "+ right_number);
                break;
            }

            game.trials ++;

        }
        UserInput.close();
    }
}

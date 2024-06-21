import java.util.*;

public class GuessingGame{
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        Random number = new Random();

        int right_number = number.nextInt(100);
        boolean Guessed = false;

        while(!Guessed){
            System.out.print("Enter your Guess: ");
            int guessed_number = UserInput.nextInt();

            if (guessed_number > right_number){
                System.out.println("Too High! Try Again.....\n");
            }else if(guessed_number < right_number){
                System.out.println("Too Low! Try Again......\n");
            }else{
                System.out.println(" ");
                System.out.println("Congratulations! You've guessed the number.");
                System.out.println("The right number was "+ right_number);
                break;
            }

        }
    }
}

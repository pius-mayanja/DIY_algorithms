import java.util.*;

public class GradeGenerator {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);

        System.out.print("Enter your mark(0 to 100): ");
        int mark = UserInput.nextInt();

        if(mark>=90){
            System.out.println("Your Grade is A");
        }else if(mark>=80){
            System.out.println("Your Grade is B");
        }else if(mark>=70){
            System.out.println("Your Grade is C");
        }else if(mark>=60){
            System.out.println("Your Grade is D");
        }else if(mark>=50){
            System.out.println("Your Grade is E");
        }else{
            System.out.println("Your Grade is F! You've failed.");
        }
        UserInput.close();
    }
}

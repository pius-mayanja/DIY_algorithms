import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isValid = false;

        while (!isValid) {
            System.out.println(" ");
            System.out.print("Enter a password: ");
            String password = scanner.nextLine();

            isValid = true; 

            if (password.length() < 8) {
                System.out.println("Password must be at least 8 characters long.");
                isValid = false;
            }

            if (!password.matches(".*[A-Z].*")) {
                System.out.println("Password must contain at least one uppercase letter.");
                isValid = false;
            }

            if (!password.matches(".*[a-z].*")) {
                System.out.println("Password must contain at least one lowercase letter.");
                isValid = false;
            }

            if (!password.matches(".*\\d.*")) {
                System.out.println("Password must contain at least one digit.");
                isValid = false;
            }

            if (password.contains(" ")) {
                System.out.println("Password must not contain spaces.");
                isValid = false;
            }

            if (isValid) {
                System.out.println("Password is valid");
            }
        }

        scanner.close();
    }
}

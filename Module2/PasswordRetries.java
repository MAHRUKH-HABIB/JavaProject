import java.util.Scanner;

public class PasswordRetries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctPassword = "secret123";
        int attempts = 3;

        while (attempts > 0) {
            System.out.print("Enter password: ");
            String input = sc.nextLine();

            if (input.equals(correctPassword)) {
                System.out.println("Login Successful!");
                break; 
            } else {
                attempts--;
                if (attempts > 0) {
                    System.out.println("Incorrect password. You have " + attempts + " attempts left.");
                } else {
                    System.out.println("Account locked. Please contact support.");
                }
            }
        }

        sc.close();
    }
}
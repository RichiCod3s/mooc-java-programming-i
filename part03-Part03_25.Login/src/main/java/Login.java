
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String user1, password1;

        System.out.println("Enter username:");
        user1 = scanner.nextLine();
        System.out.println("Enter password");
        password1 = scanner.nextLine();

        if (user1.equals("alex") && password1.equals("sunshine") || user1.equals("emma") && password1.equals("haskell")) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }

     
    }
}

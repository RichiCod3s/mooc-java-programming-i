
import java.util.Scanner;

public class UserInterface {

    private JokeManager jokeManager;
    private Scanner scanner;

    public UserInterface(JokeManager jokeManager, Scanner scanner) {
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }

    public void start() {

        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");
            System.out.println("");
            System.out.println("Input: ");
            String input = scanner.nextLine();
            switch (input) {

                case "1":
                    System.out.println("Write the joke to be added: ");
                    String joke = scanner.nextLine();
                    jokeManager.addJoke(joke);
                    System.out.println("");
                    break;
                case "2":
                    System.out.println(jokeManager.drawJoke());
                    System.out.println("");
                    break;
                case "3":
                    System.out.println("Printing the jokes.");
                    jokeManager.printJokes();
                    System.out.println("");
                    break;
                case "X":
                    break;
            }
            if (input.equals("X")) {
                break;
            }

        }
    }

}


import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            } else {
                String[] words = input.split(" ");

                for (int i = 0; i < words.length; i++) {
                    System.out.println(words[i]);
                }
            }

        }
    }
}

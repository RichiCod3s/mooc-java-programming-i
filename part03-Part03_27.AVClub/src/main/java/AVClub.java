
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        String[] arr;

        while (scanner.hasNextLine()) {
            input = scanner.nextLine();

            if (input.equals("")) {
                break;
            } else {
                arr = input.split(" ");

                for (int i = 0; i < arr.length; i++) {
                    if (arr[i].contains("av")) {
                        System.out.println(arr[i]);
                    }
                }

            }

        }

    }
}

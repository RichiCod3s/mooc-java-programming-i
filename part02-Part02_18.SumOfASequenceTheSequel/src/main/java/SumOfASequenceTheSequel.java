
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first, last, result = 0;
        System.out.println("First number?");
        first = scanner.nextInt();

        System.out.println("Last number?");
        last = scanner.nextInt();

        for (int i = first; i <= last; i++) {

            result += i;
        }

        System.out.println("The sum is: " + result);
    }
}

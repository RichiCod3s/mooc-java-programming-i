
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first;
        int second;

        System.out.println("Give the first number:");
        first = scan.nextInt();
        System.out.println("Give the second number:");
        second = scan.nextInt();

        if (first > second) {
            System.out.println("Greater number is " + first);
        } else if (second > first) {
            System.out.println("Greater number is " + second);
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}

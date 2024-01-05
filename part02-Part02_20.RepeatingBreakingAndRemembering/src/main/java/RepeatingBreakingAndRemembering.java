
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        int sum = 0;
        int noOfNum = 0;
        double average = 0;
        int even = 0, odd = 0;

        System.out.println("Give numbers:");
        input = scanner.nextInt();

        while (input != -1) {

            if (input % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            sum += input;
            input = scanner.nextInt();
            noOfNum++;

            if (input == -1) {
                System.out.println("Thx! Bye!");
            }

        }

        average = (double) sum / noOfNum;

        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + noOfNum);
        System.out.println("Average:" + average);
        System.out.println("Even:" + even);
        System.out.println("Odd: " + odd);
    }
}

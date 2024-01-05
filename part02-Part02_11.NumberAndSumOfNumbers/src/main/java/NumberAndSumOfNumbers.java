
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int noOfNum = 0;
        int sumOfNum = 0;

        while (true) {
            System.out.println("Give a number: ");
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }

            sumOfNum += num;
            noOfNum++;
        }

        System.out.println("Number of numbers: " + noOfNum);
        System.out.println("Sum of the numbers: " + sumOfNum);
    }
}

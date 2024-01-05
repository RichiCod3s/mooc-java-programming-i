
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int noOfNum = 0;
        int sumOfNum = 0;
        double averageOfNum;

        while (true) {
            System.out.println("Give a number: ");
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }

            sumOfNum += num;
            noOfNum++;
        }

        averageOfNum = (double)sumOfNum / noOfNum;

        System.out.println("Average of the numbers: " + averageOfNum);

    }
}

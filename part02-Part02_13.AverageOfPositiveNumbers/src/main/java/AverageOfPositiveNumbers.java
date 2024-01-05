
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int noOfNum = 0;
        int sumOfPosNum = 0;
        double average = 0;

        while (true) {

            int num = scanner.nextInt();

            if (num == 0) {
                break;
            }

            if (num > 0) {
                sumOfPosNum += num;
                noOfNum++;
            }

        }

        if (sumOfPosNum > 0) {
            average = (double)sumOfPosNum / noOfNum;
            System.out.println(average);
        } else {
            System.out.println("Cannot calculate the average");
        }

    }
}

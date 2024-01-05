
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        int num1;
        int num2;
        
        System.out.println("Give the first number:");
        
        num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        num2 = Integer.valueOf(scanner.nextLine());
        
        
        double result = ((int)num1 + num2) / 2.0;
        System.out.println("The average is " + result);
    }
}

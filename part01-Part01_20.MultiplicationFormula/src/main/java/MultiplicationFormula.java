
import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

  int num1;
        int num2;
        
        System.out.println("Give the first number:");
        
        num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        num2 = Integer.valueOf(scanner.nextLine());
        
        
        int result = num1 * num2;
        System.out.println(num1 +" * " + num2 + " = " + result);
    }
}

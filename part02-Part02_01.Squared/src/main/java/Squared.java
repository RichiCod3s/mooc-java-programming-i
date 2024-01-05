
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int num1 = Integer.valueOf(scanner.nextLine());
        
        int squared = num1 * num1;
        
        System.out.println(squared);
    }
}

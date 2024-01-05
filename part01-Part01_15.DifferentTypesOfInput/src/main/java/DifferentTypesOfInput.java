
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
 
        System.out.println("Give a string:");
        String input = scan.nextLine();
        
        System.out.println("Give an integer:");
        int inty = Integer.valueOf(scan.nextLine());
          System.out.println("Give a double:");
        double floatingPoint = Double.valueOf(scan.nextLine());
        
          System.out.println("Give a boolean:");
        boolean trueOrFalse = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + input);
        System.out.println("You gave the integer " + inty);
        System.out.println("You gave the double " + floatingPoint);
        System.out.println("You gave the boolean " + trueOrFalse);
    }
}

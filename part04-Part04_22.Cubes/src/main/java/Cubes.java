
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        while(scanner.hasNextLine()){
            
           String input = scanner.nextLine();
           
           if(input.equals("end")){
               break;
           }
           
           int number = Integer.valueOf(input);
           
            System.out.println(number*number*number);
        }
        
    }
}

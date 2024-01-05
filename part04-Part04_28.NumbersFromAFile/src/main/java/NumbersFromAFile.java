
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int counter =0;
                 
        System.out.println("File? ");
        String file = scanner.nextLine();
        System.out.println("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.println("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
       try (Scanner scan = new Scanner(Paths.get(file))) {
            while (scan.hasNextInt()) {
                int input = scan.nextInt();
              // we could also do a String and Integer.value of here instead coupled with nextLine instead on nextInt()
               if(input>= lowerBound && input <= upperBound){
                  counter++;
               }
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
       
        System.out.println("Numbers: " + counter);
    }

}

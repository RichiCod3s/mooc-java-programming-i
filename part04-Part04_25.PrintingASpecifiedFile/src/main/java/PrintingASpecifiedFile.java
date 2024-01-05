
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String fileName;
        
        System.out.println("Which file should have its contents printed?");
        
        fileName = scanner.nextLine();
        
        try(Scanner scan = new Scanner(Paths.get(fileName))){
            while(scan.hasNextLine()){
                String row = scan.nextLine();
                System.out.println(row);
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
        
    }
}

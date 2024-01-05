
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file:");
        
        String file = scanner.nextLine();
        
        
        try(Scanner scan = new Scanner(Paths.get(file))){
            while(scan.hasNextLine()){
                String line =scan.nextLine();
                String[] arr = line.split(",");
                
                 // THERE IS NO NEED FOR A LOOP 
                 //YOU CAN ACCESS STRAIGHT FROM EACH LINE
                String name = arr[0];
                int age = Integer.valueOf(arr[1]);
                
               
               /* for(int i =0;i<arr.length; i+=2){
                    System.out.println(arr[i] + arr[i+1]);
                }*/
                
                System.out.println(name + ",  age: " + age + " years");
                
            }//while
        }catch(Exception e){
            System.out.println("Error" + e.getMessage());
        }//catch
        
    }
}

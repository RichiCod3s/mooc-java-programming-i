
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name=null;
        int oldest=0;
        
        
        while(scanner.hasNextLine()){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }else{
               String[] arr = input.split(",");
                
              for(int i = 1; i < arr.length; i+=2){
                  int age = Integer.valueOf(arr[i]);
                  if(age> oldest){
                      oldest = age;
                      name = arr[i-1];
                  }
                }
            }
            
                
        }
        
        
        System.out.println("Age of the oldest: " + name);

    }
}
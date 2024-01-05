
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        int oldest=0;
        
        
        while(scanner.hasNextLine()){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }else{
                String[] arr = input.split(",");
                
               for(int i = 1; i < arr.length; i+=2){
                    oldest = Integer.valueOf(arr[i])> oldest? Integer.valueOf(arr[i]):oldest;
                }
            }
             
                
        }
        
        System.out.println("Age of the oldest: " + oldest);

    }
}

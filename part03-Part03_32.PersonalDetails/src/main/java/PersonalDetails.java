
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String longestName= "";
        int sum =0;
        int numOfYears=0;
        double averageYears=0;
        
     
        
       ArrayList<String> list = new ArrayList<String>();
       
       while(scanner.hasNextLine()){
            String input = scanner.nextLine();
            
            if(input.equals("")){
                break;
            }
            
            String[] arr = input.split(",");
            
            
           //add Strings too arrayList
           for(int i=0; i<arr.length;i+=2){
             list.add(arr[i]);
           }
           // iterate trough the numbers and add to sum and numOfYears
          for(int i=1; i<arr.length;i+=2){
             sum += Integer.valueOf(arr[i]);
             numOfYears++;
           }
        }
        
       // enhanced for-loop to iterate through ArrayList and find largest size string
       for(String lists:list){
           if(lists.length()>longestName.length()){
               longestName =lists;
           }
       }

        
        System.out.println("Longest Name: " + longestName);
        averageYears = (double)sum / numOfYears;
        System.out.println("Average of the birth years: " + averageYears);
    }
}

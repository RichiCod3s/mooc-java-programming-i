
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();
        
       try(Scanner scanner = new Scanner(Paths.get(file))){
           while(scanner.hasNextLine()){
               String line = scanner.nextLine();
               String[] arr = line.split(",");
               //we can add variables
               //String name = arr[0] 
               //String age = Integer.valeueOf(arr[1])  AND THEM PLACE THEM IN THE CONSTRUCTOR BELOW
               //OR
              // we can add straight from the split like this:
               persons.add(new Person(arr[0],Integer.valueOf(arr[1])));
           }
       }catch(Exception e){
           System.out.println(e);
       }
           
         for(Person person:persons){
             System.out.println(person.toString());
         }  
           
           
           
        // Write here the code for reading from file
        // and printing the read records
        return persons;

    }
}

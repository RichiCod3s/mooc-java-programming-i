
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> arr = new ArrayList<>();

        while (true) {

            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
             Item newItem = new Item(identifier,name);
            if(!(arr.contains(newItem))){
                arr.add(newItem);
            }
            
            // the same as:
          //  arr.add(new Item(identifier, name))
        }
        
        for(Item i: arr){
            System.out.println(i);
        }
    }
}

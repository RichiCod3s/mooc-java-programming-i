
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");   // two files: names.txt and other-names.txt.
        String file = scanner.nextLine();
        boolean found = false;

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        try (Scanner scan = new Scanner(Paths.get(file))) {
            while (scan.hasNextLine()) {
                String name = scan.nextLine();
                if (name.equals(searchedFor)) {
                    found = true;
                }
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        
        if(found){
            System.out.println("Found!");
        }else{
            System.out.println("Not found.");
        }

    }
}

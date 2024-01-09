
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     
        //create new scanner and SimpleDictionary class
        Scanner scanner = new Scanner(System.in);
        SimpleDictionary dictionary = new SimpleDictionary();
        
        // create a new TextUI class 
        TextUI textUI = new TextUI(scanner, dictionary);
        
        textUI.start();
        
        //System.out.println(dictionary.translate("pike"));
        
    }
}

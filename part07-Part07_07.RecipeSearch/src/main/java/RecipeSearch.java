
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RecipeSearch recipeSearch = new RecipeSearch();
        
        recipeSearch.commands();
      
    }

   public void commands(){
       Scanner scanner = new Scanner(System.in);
       //System.out.println("File to read:");
       // String fileName = scanner.nextLine();
       System.out.println("Enter command:");
       String command = scanner.nextLine();
       
       switch(command){
           case "list": listRecipes("recipes.txt");// change later to fileName
           break;
           case "stop": 
               break;
       }
   }

    public void listRecipes(String fileName) {
        try (Scanner scan = new Scanner(Paths.get(fileName))) {

            // take from first two lines as per file format
            String recipe = scan.nextLine();
            int time = Integer.valueOf(scan.nextLine());
            // print recipe
            System.out.println("Recipe:");
            System.out.println(recipe + ", cooking time: " + time);

            while (scan.hasNextLine()) {

                // if line is empty take from first two lines
                if (scan.nextLine().isEmpty()) {
                    recipe = scan.nextLine();
                    time = Integer.valueOf(scan.nextLine());
                    // print recipes
                    System.out.println(recipe + ", cooking time: " + time);

                }
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + fileName + " failed.");
        }

    }
}

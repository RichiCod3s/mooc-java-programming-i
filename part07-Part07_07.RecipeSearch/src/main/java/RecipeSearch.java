import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.List;

public class RecipeSearch {

    private ArrayList<Recipe> recipes;
    private Scanner scanner;

    public RecipeSearch() {
        this.recipes = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        RecipeSearch recipeSearch = new RecipeSearch();
        recipeSearch.commands();
    }

    public void commands() {
        System.out.println("File to read:");
        String fileName = scanner.nextLine();
        readRecipesFromFile(fileName);

        while (true) {
            System.out.println("Enter command:");
            String command = scanner.nextLine();
            switch (command) {
                case "list":
                    listRecipes();
                    break;
                case "find name":
                    findName();
                    break;
                case "find cooking time":
                    findCookingTime();
                    break;
                case "find ingredient":
                    findIngredient();
                    break;
                case "stop":
                    return;
            }
        }
    }

private void readRecipesFromFile(String fileName) {
    try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
        // Iterate over each line in the file until there are no more lines
        while (fileScanner.hasNextLine()) {
            // Read the recipe name from the current line
            String recipeName = fileScanner.nextLine();
            // Read the cooking time from the next line and convert it to an integer
            int cookingTime = Integer.parseInt(fileScanner.nextLine());
            
            // Create a new Recipe object with the name and cooking time
            Recipe recipe = new Recipe(recipeName, cookingTime);

            // Read each ingredient until an empty line or the end of the file
            String line;
            while (fileScanner.hasNextLine() && !(line = fileScanner.nextLine()).isEmpty()) {
                // Add the ingredient to the Recipe object
                recipe.addIngredient(line);
            }

            // Add the Recipe object to the list of recipes
            recipes.add(recipe);
        }
    } catch (Exception e) {
        System.out.println("Reading the file " + fileName + " failed.");
    }
}


    public void listRecipes() {
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            System.out.println(recipe);
        }
    }

    public void findName() {
        System.out.println("Searched word:");
        String searchedWord = scanner.nextLine();

        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getName().contains(searchedWord)) {
                System.out.println(recipe);
            }
        }
    }

    public void findCookingTime() {
        System.out.println("Max cooking time:");
        int maxTime = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getCookingTime() <= maxTime) {
                System.out.println(recipe);
            }
        }
    }

    public void findIngredient() {
        System.out.println("Ingredient:");
        String ingredientWanted = scanner.nextLine();

        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getIngredients().contains(ingredientWanted)) {
                System.out.println(recipe);
            }
        }
    }
}

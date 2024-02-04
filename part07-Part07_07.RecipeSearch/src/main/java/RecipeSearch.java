
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
    Scanner scanner = new Scanner(System.in);

    public void commands() {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("File to read:");
        // String fileName = scanner.nextLine();

        while (true) {
            System.out.println("Enter command:");
            String command = scanner.nextLine();
            switch (command) {
                case "list":
                    listRecipes("recipes.txt");// change later to fileName
                    break;
                case "find name":
                    findName("recipes.txt");
                    break;
                case "find cooking time":
                    findCookingTime("recipes.txt");
                    break;
                case "find ingredient":
                    findIngredient("recipes.txt");
                    break;
                case "stop":
                    return;
            }
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

    public void findName(String fileName) {

        System.out.println("Searched word:");
        String searchedWord = scanner.nextLine();

        try (Scanner scan = new Scanner(Paths.get(fileName))) {
            // take from first two lines as per file format
            String recipe = scan.nextLine();
            int time = Integer.valueOf(scan.nextLine());
            // print recipe
            System.out.println("Recipe:");
            // if the recipe contains the searched for word, print it out
            if (recipe.contains(searchedWord)) {// case sensitive

                System.out.println(recipe + ", cooking time: " + time);
            }

            while (scan.hasNextLine()) {
                // if line is empty take from first two lines
                if (scan.nextLine().isEmpty()) {
                    recipe = scan.nextLine();
                    time = Integer.valueOf(scan.nextLine());
                    // if the recipe contains the searched for word, print it out
                    if (recipe.contains(searchedWord)) {
                        System.out.println(recipe + ", cooking time: " + time);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + fileName + " failed.");
        }

    }

    public void findCookingTime(String fileName) {
        System.out.println("Max cooking time:");
        int maxTime = scanner.nextInt();

        try (Scanner scan = new Scanner(Paths.get(fileName))) {
            // take from first two lines as per file format
            String recipe = scan.nextLine();
            int time = Integer.valueOf(scan.nextLine());
            // print recipe
            System.out.println("Recipe:");
            // if the time in recipe is <= to maxTime input
            if (time <= maxTime) {
                System.out.println(recipe + ", cooking time: " + time);
            }

            while (scan.hasNextLine()) {
                // if line is empty take from first two lines
                if (scan.nextLine().isEmpty()) {
                    recipe = scan.nextLine();
                    time = Integer.valueOf(scan.nextLine());
                    // if the time in recipe is <= to maxTime input
                    if (time <= maxTime) {
                        System.out.println(recipe + ", cooking time: " + time);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + fileName + " failed.");
        }

    }

    public void findIngredient(String fileName) {
        System.out.println("Ingredient");
        String ingredientWanted = scanner.nextLine();

        try (Scanner scan = new Scanner(Paths.get(fileName))) {
            // take from first two lines as per file format
            String recipe = scan.nextLine();
            int time = Integer.valueOf(scan.nextLine());
            // print recipe
            System.out.println("Recipe:");
            // after the first two lines, run through the lines up to where there is no empty lines
            // as per the txt file format
            while (!(scan.nextLine().isEmpty())) {
                String ingredient = scan.nextLine();
                if (ingredient.equals(ingredientWanted)) {
                    System.out.println(recipe + ", cooking time: " + time);
                }
            }

            while (scan.hasNextLine()) {
                // if line is empty take from first two lines
                if (scan.nextLine().isEmpty()) {
                    recipe = scan.nextLine();
                    time = Integer.valueOf(scan.nextLine());
                    // if the recipe contains the searched for word, print it out
                    while (!(scan.nextLine().isEmpty())) {
                        String ingredient = scan.nextLine();
                        if (ingredient.equals(ingredientWanted)) {
                            System.out.println(recipe + ", cooking time: " + time);
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + fileName + " failed.");
        }

    }

}// class

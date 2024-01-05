
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int i = 0;
        while (i < number) {
            System.out.print("*");
            i++;
        }

        // call the print command n times
        // in the end print a line break with the comand
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int i = 1;
        int j = size;
        while (i <= size) {

            printSpaces(j-1);
            printStars(i);
            i++;
            j--;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
         // Print the tree part (triangle)
        int i = 1;
        int j = height;
        while (i <= height) {
            printSpaces(j - 1);
            printStars(2 * i - 1);
            i++;
            j--;
        }

        // Print the base of the tree
        for (int k = 0; k < 2; k++) {
            printSpaces(height - 2);
            printStars(3);
        }

    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}

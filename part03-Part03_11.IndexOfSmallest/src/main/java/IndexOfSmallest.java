
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList();

        int index;
        int smallest;
        // implement here a program that reads user input
        // until the user enters 9999
        while (true) {
            int input = scanner.nextInt();
            if (input == 9999) {
                break;
            }
            numbers.add(input);
        }

        smallest = numbers.get(0);
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        for (int i = 0; i < numbers.size(); i++) {
            smallest = numbers.get(i) < smallest ? numbers.get(i) : smallest;
        }

        System.out.println("Smallest number: " + smallest);

        for (int i = 0; i < numbers.size(); i++) {
            if (smallest == numbers.get(i)) {
                System.out.println("Found at index " + i);
            }
        }

    }
}


import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 0, 99, 3, 12};
        // int[] array = {-1, 3, 1, 2};
        
        //test functionality of each method
        //  System.out.println("Smallest: " + MainProgram.smallest(array));
        // System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(array));
        // System.out.println(MainProgram.indexOfSmallestFrom(array, 2));
        // MainProgram.swap(array, 1, 0);
        //System.out.println(Arrays.toString(array));
        MainProgram.sort(array);

    } //main

    // returns smallest number in the array
    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i : array) {
            if (i < smallest) {
                smallest = i;
            }
        }
        return smallest;
    }

    // returns the array index of the smallest number
    public static int indexOfSmallest(int[] array) {
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallest(array)) {
                index = i;
            }
        }
        return index;
    }

    // prints the index of the smallest number starting from an index
    public static int indexOfSmallestFrom(int[] table, int startIndex) {

        int smallest = table[startIndex];
        int indexOfSmallest = startIndex;  // set to start index not at 0 as if the smallest is at start it won't update 

        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < smallest) {
                smallest = table[i];
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;

    }

    //swaps the numbers in these indices with each other.
    public static void swap(int[] array, int index1, int index2) {
        int holder = array[index1];

        array[index1] = array[index2];
        array[index2] = holder;
    }

    public static void sort(int[] array) {
        int smallestIndex = 0;

        for (int i = 0; i < array.length; i++) {
            //print the array
            System.out.println(Arrays.toString(array));
            // get the smallest index from poistion 0, then 1, then 2 etc
            smallestIndex = indexOfSmallestFrom(array, i);
            //swap the positions in array increasing each time
            swap(array, i, smallestIndex);
        }

    }

}//class

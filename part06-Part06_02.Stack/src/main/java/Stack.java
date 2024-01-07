
import java.util.ArrayList;

public class Stack {

    ArrayList<String> list = new ArrayList<>();

    //tells whether or not the stack is empty.
    public boolean isEmpty() {
        return list.isEmpty();
    }

    //Adds the value given as a parameter to the top of the stack.
    public void add(String value) {
        list.add(value);
    }

    //returns the values ​​contained in the stack as a list.
    public ArrayList<String> values() {
        // ensure that a ArrayList is returned of this type
        ArrayList<String> result = new ArrayList<>();
        for (String i : list) {
            result.add(i);
        }
        return result;
    }

    // returns the topmost value (i.e., the last value added to the deque) and removes it from the stack.
    public String take() {
        int index = list.size() - 1;
        String lastValue = list.get(index);
        list.remove(index);
        return lastValue;

    }

}

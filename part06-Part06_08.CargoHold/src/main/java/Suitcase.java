
import java.util.ArrayList;

public class Suitcase {

    private int maxWeight;
    private ArrayList<Item> scase;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        scase = new ArrayList<>();
    }
    //**Check that the addItem method of the Suitcase class does not add a new item to the suitcase if the suitcase is full.**
    //adds item to suitcase
    public void addItem(Item item) {
        
        if(totalWeight()+item.getWeight()<=maxWeight)
        scase.add(item);
    }

    // prints out all items in scase
    public void printItems() {
        for (Item items : scase) {
            System.out.println(items);
        }
    }

    //** Check that the totalWeight method calculates and returns the sum of the weights of all items in the suitcase.**
    public int totalWeight() {
        int totalWeight = 0;

        for (Item items : scase) {
            totalWeight += items.getWeight();
        }
        return totalWeight;
    }

    //returns the largest item based on weight. If several items share the heaviest weight, the method can return any one of them
    public Item heaviestItem() {
        if (scase.isEmpty()) {
            return null;
        }

        Item heaviestItem = scase.get(0);

        for (Item items : scase) {
            if (heaviestItem.getWeight() < items.getWeight()) {
                heaviestItem = items;
            }
        }
        return heaviestItem;

    }

    //  Check that the toString method of the Suitcase class prints the items in the suitcase. (for example: "3 items (15 kg)".
 
    public String toString() {
        int totalWeight = 0;

        if (scase.isEmpty()) {
            return "no items (0 kg)";
        }

        if (scase.size() == 1) {
            return "1 item (" + scase.get(0).getWeight() + " kg)";
        }

        for (Item i : scase) {
            totalWeight += i.getWeight();
        }
        return scase.size() + " items (" + totalWeight + " kg)";
    }
}

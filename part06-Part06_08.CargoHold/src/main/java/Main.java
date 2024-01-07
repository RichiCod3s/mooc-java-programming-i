
public class Main {

    public static void main(String[] args) {
        // You can use the main to test your classes!
        Item book = new Item("The lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("brick", 4);
        //testing Item
        System.out.println("The book's name: " + book.getName());
        System.out.println("The book's weight: " + book.getWeight());

        System.out.println("Book: " + book);
        System.out.println("Phone: " + phone);
        
        
        //testing suitcase
        Suitcase suitcase = new Suitcase(5);
        System.out.println(suitcase);

        suitcase.addItem(book);
        System.out.println(suitcase);

        suitcase.addItem(phone);
        System.out.println(suitcase);

        suitcase.addItem(brick);
        System.out.println(suitcase);
            
        System.out.println("");
        
        System.out.println("The suitcase contains the following items:");
        suitcase.printItems();
        System.out.println("Total weight: " + suitcase.totalWeight() + " kg");
        
        //testing heaviestItem()
        System.out.println("");
        
        Suitcase suitcaseTwo = new Suitcase(10);
        suitcaseTwo.addItem(book);
        suitcaseTwo.addItem(phone);
        suitcaseTwo.addItem(brick);
        
        Item heaviest = suitcaseTwo.heaviestItem();
        System.out.println("Heaviest item: "+ heaviest);
        
        
        System.out.println("");
        
        //testing Hold Class
        
        Suitcase adasCase = new Suitcase(10);
        adasCase.addItem(book);
        adasCase.addItem(phone);

        Suitcase pekkasCase = new Suitcase(10);
        pekkasCase.addItem(brick);

        Hold hold = new Hold(1000);
        hold.addSuitcase(adasCase);
        hold.addSuitcase(pekkasCase);

        System.out.println(hold);
        
        
        System.out.println("");
        System.out.println("The suitcases in the hold contain the following items:");
        hold.printItems();

    }

}


import java.util.Scanner;
import java.util.ArrayList;

public class Database {

    ArrayList<Bird> birds;

    public Database() {
        birds = new ArrayList();
    }

    // starts the program + commands
    public void start(Scanner scan) {

        while (true) {
            System.out.println("Enter command:");
            String command = scan.nextLine();

            switch (command) {
                case "Add":
                    add(scan);
                    break;
                case "Observation":
                    observation(scan);
                    break;
                case "All":
                    all();
                    break;
                case "One":
                    one(scan);
                    break;    
                case "Quit":
                    return;
            }
        }
    }

    // adds a bird to the database
    public void add(Scanner scan) {
        System.out.println("Name: ");
        String name = scan.nextLine();
        System.out.println("Name in Latin: ");
        String latinName = scan.nextLine();

        // add new bird object to database array
        birds.add(new Bird(name, latinName));
    }

    // adds an observation -only needs to count the no.of observations for this exercise.
    public void observation(Scanner scan) {
        System.out.println("bird?");
        String searchedBird = scan.nextLine();
        boolean found = false;

        for (Bird bird : birds) {
            if (searchedBird.equals(bird.getName())) {
                bird.addObservation("observation"); //
                found = true;
            }
        }

        if (!found) {
            System.out.println("Not a bird!");
        }
    }
    
    // prints all birds in database
    public void all() {
        for(Bird bird : birds) {
            System.out.println(bird);
        }

    }
    
    // prints one specified bird
    public void one(Scanner scan){
          System.out.println("bird?");
        String searchedBird = scan.nextLine();
        boolean found = false;

        for (Bird bird : birds) {
            if (searchedBird.equals(bird.getName())) {
                System.out.println(bird.toString());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Not found!");
        }
}
    
}

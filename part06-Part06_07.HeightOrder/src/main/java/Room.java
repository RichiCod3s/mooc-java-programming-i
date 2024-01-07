
import java.util.ArrayList;

public class Room {

    private ArrayList<Person> room;

    public Room() {
        room = new ArrayList<>();
    }

    //adds the person passed as a paramter to the list.
    public void add(Person person) {
        room.add(person);
    }

    public boolean isEmpty() {
        if (room.isEmpty()) {
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons() {

        ArrayList<Person> list = new ArrayList<>();
        for (Person i : room) {
            list.add(i);
        }
        return list;
    }

    //returns the shortest person added to the room.
    public Person shortest() {
        if (room.isEmpty()) {
            return null;
        }

        Person shortest = room.get(0);

        for (Person people : room) {
            if (shortest.getHeight() > people.getHeight()) {
                shortest = people;
            }
        }
        return shortest;
    }

    // takes the shortest person in the room. 
    public Person take() {
        if (room.isEmpty()) {
            return null;
        }

        Person shortestPerson = shortest();
        this.room.remove(shortestPerson);
        return shortestPerson;
    }
}

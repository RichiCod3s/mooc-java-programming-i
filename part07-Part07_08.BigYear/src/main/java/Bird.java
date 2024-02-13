
import java.util.ArrayList;

public class Bird {
    // variables
    private String name;
    private String latinName;
    private int noOfObservations;

    ArrayList<String> observations;
    
        public Bird(String name, String latinName){
            this.name = name;
            this.latinName = latinName;
            observations = new ArrayList<>();
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatinName() {
        return latinName;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }
       // add an observation to the bird 
    public void addObservation(String observation){
        observations.add(observation);
        noOfObservations++;
    }

    @Override
    public String toString() {
        return name  +"(" + latinName + "): " + noOfObservations + " observations";
    }
 
    
    
    
}// class

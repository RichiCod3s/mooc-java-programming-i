import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    
    private ArrayList<String> jokes;
            
    public JokeManager(){
        this.jokes= new ArrayList<>();
    }
    
    //adds a joke to the manager.
    public void addJoke(String joke){
        this.jokes.add(joke);
    }
    // chooses one joke at random and returns it. 
    //If there are no jokes stored in the joke manager, returns the string "Jokes are in short supply.".
    public String drawJoke(){
        if(jokes.isEmpty()){
            return "Jokes are in short supply.";
        }
         Random draw = new Random();
        int index = draw.nextInt(jokes.size());
        String joke = jokes.get(index);
        
        return joke;
        
    }
    
    // prints all the jokes stored in the joke manager.
    public void printJokes(){
        for(String joke:jokes){
            System.out.println(joke);
        }
    }
    
    
    
}

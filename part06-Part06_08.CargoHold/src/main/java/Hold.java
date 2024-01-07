import java.util.ArrayList;

public class Hold {

    private int maxWeight;
    private ArrayList<Suitcase> hold;
    
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        hold = new ArrayList<>();
    }
    //**Make sure a hold does not add more suitcases than its maximum weight allows.**
    public void addSuitcase(Suitcase suitcase){
        int holdWeight=0;
        for(Suitcase scase:hold){
            holdWeight += scase.totalWeight();
        }
        
        if(holdWeight+suitcase.totalWeight()<=maxWeight)
        hold.add(suitcase);
    }
    
     public void printItems(){
      for(Suitcase scase: hold){
          scase.printItems();
          }
      }  
    

    public String toString(){
        int totalWeight=0;
        
        if(hold.isEmpty()){
           return "no suitcases (0 kg)";
        }
        
        if(hold.size()==1){
            return "1 suitcase ("+hold.get(0).totalWeight();
        }
        
        for(Suitcase scase:hold){
            totalWeight += scase.totalWeight();
        }
        
        
        return hold.size() +" suitcases (" + totalWeight +" kg)";
    }
    
    
    
}

import java.util.ArrayList;

public class Package {
   private ArrayList<Gift> pack;  
    
   public Package() {
       this.pack = new ArrayList<>();
    }
   
   //adds the gift passed as a parameter to the package.
   public void addGift(Gift gift){
       pack.add(gift);
   }
   
   // returns the total weight of the package's gifts.
   public int totalWeight(){
       if(pack.isEmpty()){
           return -1;
       }
       int totalWeight=0;
       
       for(Gift gifts: pack){
       totalWeight += gifts.getWeight();
       
       }
       return totalWeight;
   }
   
   
   

}
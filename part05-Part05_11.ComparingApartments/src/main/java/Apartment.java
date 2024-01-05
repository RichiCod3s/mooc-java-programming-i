
public class Apartment {
   
    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared){
        if(this.squares> compared.squares){
          return true;
        }else{
            return false;
        }
    }
    
    public int priceDifference(Apartment compared){
        int thisPrice=this.squares * this.princePerSquare;
        int comparedPrice = compared.squares * compared.princePerSquare;
        return Math.abs(thisPrice - comparedPrice);
    }
    
    public boolean moreExpensiveThan(Apartment compared){
    
        int thisPrice=this.squares * this.princePerSquare;
         int comparedPrice = compared.squares * compared.princePerSquare;
         
         return thisPrice>comparedPrice;
    } 
    
    // getters
     public int getRooms() {
        return rooms;
    }

    public int getSquares() {
        return squares;
    }

    public int getPrincePerSquare() {
        return princePerSquare;
    }

}
 
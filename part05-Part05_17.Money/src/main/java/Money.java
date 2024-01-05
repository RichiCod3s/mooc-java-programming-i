
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    
    // returns a new money object that is worth the total amount of the object whose method was called
    public Money plus(Money addition){
       // I simply added the euros and cents from the original and entered money objects
      Money newMoney = new Money(this.euros+addition.euros, this.cents+addition.cents);
      
      return newMoney;
    }
    
    //returns true if the money-object on which the method is called on has a lesser value than the money object given as a parameter.
    
    public boolean lessThan(Money compared){
    
        if(this.euros<compared.euros){
            return true;
        }
        
        
      if(this.euros == compared.euros){
        if(this.cents<compared.cents){
            return true;
        }
    }
        return false;
}
    
    //returns a new money object worth the difference of the object whose method was called
    //  If the difference would be negative, the worth of the created money object is set to 0.
    public Money minus(Money decreaser){
     int newEuros = this.euros - decreaser.euros;
        int newCents = this.cents - decreaser.cents;

        if (newCents < 0) {
            newCents += 100;
            newEuros--;
        }

        if (newEuros < 0) {
            newEuros = 0;
            newCents = 0;
        }

        return new Money(newEuros, newCents);
        
    }
    
    
    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
/*
   if(this.euros>decreaser.euros){
        int newEuro = this.euros - decreaser.euros;
       }else if(this.euro == decreser.euro){
           newEuro = this.euro;
       }
    }

*/
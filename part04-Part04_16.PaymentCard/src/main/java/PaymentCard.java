
public class PaymentCard {
    private double balance;
    
    public PaymentCard(double openingBalance){
        this.balance = openingBalance;
                
    }
    
    public void eatAffordably(){
        if(balance - 2.60 < 0.0){
        
        }else{
            this.balance -= 2.60;
        }
    }
    
    public void eatHeartily(){
        if(balance - 4.60 <0.0){
       
        }else{
             this.balance -= 4.60;
        }   
    }
    
    public void addMoney(double amount){
       if(amount>0){
        if(this.balance + amount >=150 ){
            this.balance = 150;
        }else{
            this.balance += amount;
        }
       }else{
           
       }
    }
    
    public String toString(){
        
        return "The card has a balance of " + balance + " euros";
    }
    
}

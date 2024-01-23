
public class Container {

    private int amountOfLiquid;

    public Container() {

    }

    //returns the amount of liquid in a container as an integer.
    public int contains() {

        return this.amountOfLiquid;
    }

    /*adds the amount of liquid given as a parameter to the container. 
    If the amount is negative, no liquid is added. A container can hold a maximum of 100 units of liquid.*/
    public void add(int amount) {
        if (amount > 0) {
            if (amountOfLiquid + amount > 100) {
                amountOfLiquid = 100;
            } else {
                amountOfLiquid += amount;
            }
        }
    }
    /*removes the amount of liquid given as a parameter from the container. 
    If the amount is negative, no liquid is removed. A container can never hold less than 0 units of liquid.*/
    public void remove(int amount) {
        if (amount > 0) {
            if(amountOfLiquid - amount < 0){
              amountOfLiquid =0;
            }else{
                 amountOfLiquid -= amount;
            }
        }
    }
    
    public String toString(){
        return amountOfLiquid + "/100";
    }
    
    
    
    
    
}// class

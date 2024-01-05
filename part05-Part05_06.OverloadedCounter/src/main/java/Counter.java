
public class Counter {

int value;

    public Counter(int startValue){
        this.value = startValue;
    }
    
    public Counter(){
        this(0);
    }

    
    public int value(){
        return value;
    }
    
    public void increase(){
        this.value = value+1;
    }
    
    public void increase(int increaseBy){
        if(increaseBy <0){
            this.value = value;
        }else{
            this.value = value + increaseBy;
        }
        
         
    }
    
    public void decrease(){
         this.value = value-1;
    }
            
     public void decrease(int decreaseBy){
         
          if(decreaseBy <0){
            this.value = value;
        }else{
         this.value = value - decreaseBy;
          }
    }  
            
            
            
            
            }

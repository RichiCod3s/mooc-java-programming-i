
public class Gauge {
        private int value;
    
    public Gauge(){
        value =0;
    }
    
    public void increase(){
        if(value<5){
            this.value++;
        }
    }
    
    public void decrease(){
        if(value>0){
            value--;
        }
    }
    
    public int value(){
        return this.value;
    }
    
    public boolean full(){
        return this.value == 5;
    }
}


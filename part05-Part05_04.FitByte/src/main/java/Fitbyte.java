
public class Fitbyte {
   private int age;
   private int restingHeartRate;

 
   
   
   public Fitbyte(int age, int restingHeartRate){
       this.age = age;
       this.restingHeartRate = restingHeartRate;
   }
   
   public double targetHeartRate(double percentageOfMaximum)
   {
       return ((maxHeartRate() - restingHeartRate) * (percentageOfMaximum)+ restingHeartRate);
   }
   
     public int getAge() {
        return age;
    }

    public int getRestingHeartRate() {
        return restingHeartRate;
    }

    public double maxHeartRate() {
        return (206.3 - (0.711 * age));
    }
   
   
   
   
   
   
   
}

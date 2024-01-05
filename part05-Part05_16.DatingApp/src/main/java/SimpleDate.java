
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    //implement the method public void advance() that moves the date by one day. In this exercise we assume that each month has 30 day. 
    public void advance() {
        if (day == 30 && month == 12) {
            day = 1;
            month = 1;
            year++;
        } else if (day == 30) {
            day = 1;
            month++;
        } else {
            day++;
        }

    }
    
    //moves the date by the number of days that is given. Use the method advance() that you implemented in the previous section to help you in this.
    public void advance(int howManyDays) {
        for(int i =0; i<howManyDays; i++){
            advance();
        }
    }
    // creates a new SimpleDate object whose date is the specified number of days greater than the object that the method was called on
    public SimpleDate afterNumberOfDays(int days){
        SimpleDate newDate = new SimpleDate(this.day,this.month,this.year);
        
        newDate.advance(days);
        
        return newDate;
    }

}

public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;
   
    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        // the counters that represent hours, minutes and seconds are created and set to have the correct initial values
        
        hours=new BoundedCounter(23);
        minutes=new BoundedCounter(59);
        seconds=new BoundedCounter(59);
        
        hours.setValue(hoursAtBeginning);
        minutes.setValue(minutesAtBeginning);
        seconds.setValue(secondsAtBeginning);
        
        
        
    }
    
    public void tick() {
        // Clock advances by one second
    
    if(seconds.getValue()==59){
        seconds.next();
        if(minutes.getValue()==59){
        
            hours.next();
        }
        minutes.next();
        
    }
    else{
    
    seconds.next();
    
    }
    
    

    
    }
    
    public String toString() {
        // returns the string representation
        return hours.toString()+":"+minutes.toString()+":"+seconds.toString();
        
    }
}


public class NumberStatistics {
    
    
     private int amountOfNumbers;
     private int sum;
    public NumberStatistics() {
        // initialize here the object variable amountOfNumbers
    }

    public void addNumber(int number) {
        // code here
        amountOfNumbers++;
        sum=sum+number;
    }

    public int amountOfNumbers() {
        // code here
        return amountOfNumbers;
    }
    
    
      public int sum() {
        // code here
        
        return sum;
    }

    public double average() {
        
        if(amountOfNumbers==0)
            return 0;
        else
        return  (double)sum/amountOfNumbers;
        // code here
    }
}

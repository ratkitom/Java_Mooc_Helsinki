/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomasz
 */
public class BoundedCounter {
    
     private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        // write code here
        
        this.upperLimit=upperLimit;
        this.value=0;
    }

    public void next() {
        // write code here
        if(value<upperLimit){
        
        this.value++;
        }
        else{
        
        this.value=0;
        }
        
    }

    public String toString() {
        // write code here
        if(value<10){
        
            return "0"+value;
        }   else{
        
            return ""+value;
        }
        
        
    }
    
    public int getValue() {
    // write here code that returns the value
    
    
    
     return this.value;
}
   public void setValue(int value){
   
       if(value>0&&value<=this.upperLimit){
       
       this.value=value;
       }
   }
    
}

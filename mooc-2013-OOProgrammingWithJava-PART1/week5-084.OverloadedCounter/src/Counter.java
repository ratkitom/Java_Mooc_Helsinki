/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomasz
 */
public class Counter {
    
   private int value;
   private boolean check;
    
    
    
    public Counter(int startingValue, boolean check){
    
        
        this.value=startingValue;
        this.check=check;
        
    
    
    }
    
    public Counter(int startingValue){
    
    this.value=startingValue;
    this.check=false;
    
    
    }
    
    public Counter(boolean check){
    
    this.value=0;
    this.check=check;
    
    
    
    }
    
    
    public Counter(){
    
        this.value=0;
        this.check=false;
        
    
    }
    
    public int value(){
    
    return this.value;
    }
    
    public void increase(){
    
    this.value++;
    
    }
    
    public void decrease(){
    
        
    if(this.check){    
        if(this.value>0)
        this.value--;
    }
    
    else{
    
    this.value--;
    }
    
    }
    
    public void increase(int increaseAmount){
        
        if(increaseAmount>0)
    
        value=value+increaseAmount;
    
    
    }
    
    public void decrease(int decreaseAmount){
    
    if(decreaseAmount>0){
    
    
       if(this.check){    
        if(this.value<=decreaseAmount)
        value=0;
    }
    
    else{
    
    value=value-decreaseAmount;
    }
    
    
    
    
    }
    
    
    }
    
    
    
    
    
    
}

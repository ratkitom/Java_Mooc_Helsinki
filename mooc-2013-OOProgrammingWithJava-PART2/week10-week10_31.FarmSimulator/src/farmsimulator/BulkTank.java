/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author tomasz
 */
public class BulkTank {
    
    private double capacity;
    private double volume;
    
    public BulkTank(){
    
    capacity=2000;
    }
    
    public BulkTank(double capacity){
    
        this.capacity=capacity;
    }
   
    public double getCapacity(){
    
    return capacity;
    }
    
    public double getVolume(){
    
        return volume;
    }
    
    public double howMuchFreeSpace(){
    
    
        return capacity-volume;
    }
    
    public void addToTank(double amount){
    
        if((capacity-volume)>amount){
        
            volume=volume+amount;
        } else volume=capacity;
        
        
    }
    
    public double getFromTank(double amount){
    
        if(amount<volume){
        
            volume=volume-amount;
            return amount;
        } else{
        
            volume=0;
            return volume;
        }
        
    }
    
    public String toString(){
        
        
    
        return Math.ceil(volume)+"/"+Math.ceil(capacity);
    
    }
            
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomasz
 */
import java.util.ArrayList;
public class Box implements ToBeStored{

    
    private double maxWeight;
    
    
    private ArrayList<ToBeStored> toBeStored;
    
    public Box(double maxWeight){
    this.maxWeight=maxWeight;
    this.toBeStored=new ArrayList<ToBeStored>();
    
    }
    
    @Override
    public double weight() {
        
        double weight=0;
        for(ToBeStored toBeStored:this.toBeStored){
        
        weight=weight+toBeStored.weight();
        
        }
        
       
        return weight;
        
    }
    
    
    public void add(ToBeStored toBeStored){
    
        if(this.weight()+toBeStored.weight()<=maxWeight){
        
        this.toBeStored.add(toBeStored);
       
        
        }
    
    
    }
    
    
    
    public String toString(){
    
    
    return "Box: "+toBeStored.size()+" things,"+" total weight "+weight()+" kg";
    
    }
}

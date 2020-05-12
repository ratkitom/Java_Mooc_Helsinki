/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;
import java.util.ArrayList;

/**
 *
 * @author tomasz
 */


public class Box implements Thing {
    
   private ArrayList<Thing> things;
   private int maximumCapacity; 
    public Box(int maximumCapacity){
        
        
        this.maximumCapacity=maximumCapacity;
        this.things=new ArrayList();
        
            
    
    }
    
    
   public boolean addThing(Thing thing){
     
       if((thing.getVolume()+getVolume())<=maximumCapacity){
       
       
       things.add(thing);
       return true;
       }    else{
       
       return false;
       
       }
     
     
   }

    @Override
    public int getVolume() {
        
        int volume=0;
        
        for(Thing thing:things){
        
        volume=volume+thing.getVolume();
        
        }
        
        return volume;
        
    }
    
    
    
   
     
     
     
     
    
    
    
}

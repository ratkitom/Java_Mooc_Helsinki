/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;
import java.util.*;
/**
 *
 * @author tomasz
 */
public class MaxWeightBox extends Box {
    
    private List<Thing> things;
   
    private int maxWeight;
    
    
    public MaxWeightBox(int maxWeight){
    
        this.things=new ArrayList();
        this.maxWeight=maxWeight;
        
        
        
    
    }

    @Override
    public void add(Thing thing) {
        
        int thingsWeight=0;
        for(Thing temp:things){
        
            thingsWeight=thingsWeight+temp.getWeight();
        }
        
        if(thingsWeight+thing.getWeight()<=maxWeight){
        
        things.add(thing);
        }
        
        
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        
      return  things.contains(thing);
        
    }
    
}

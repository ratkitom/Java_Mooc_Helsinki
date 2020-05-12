/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

/**
 *
 * @author tomasz
 */
import java.util.*;
public class BlackHoleBox extends Box {
    
   private List<Thing> things;
    
    public BlackHoleBox(){
        
        things=new ArrayList();
        
        
    }

    @Override
    public void add(Thing thing) {
        
        things.add(thing);
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        
        return false;
     }
    
   
    
    
}

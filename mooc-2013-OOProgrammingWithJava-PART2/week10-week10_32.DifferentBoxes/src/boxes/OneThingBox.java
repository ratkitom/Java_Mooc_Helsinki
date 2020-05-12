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
public class OneThingBox extends Box {
    
  private  List<Thing> things;
    
    public OneThingBox(){
        
        things=new ArrayList();
    }

    @Override
    public void add(Thing thing) {
        
        if(things.size()==0){
        
            things.add(thing);
        }
        
        
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        
        return things.contains(thing);
    }
}

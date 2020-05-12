/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomasz
 */

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class RingingCentre {
    
    
    private Map<Bird,List<String>> birdsobserved;
    
    public RingingCentre(){
    
        this.birdsobserved=new HashMap();
    }
    
    public void observe(Bird bird, String place){
        
        if(!this.birdsobserved.containsKey(bird)){
        
            this.birdsobserved.put(bird, new ArrayList<String>());
        
        }
        
        this.birdsobserved.get(bird).add(place);
        
        
     }
    
    public void observations(Bird bird){
        
        if(this.birdsobserved.containsKey(bird)){
        
            
            List<String> places=this.birdsobserved.get(bird);
            
            System.out.println(bird.toString()+" observations: "+places.size());
            for(String place:places){
            
                System.out.println(place);
                
            }
            
        
        
        }   else{
        
            System.out.println(bird.toString()+" observations: 0");
        
        }
        
    
    }
    
    
    
}

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
public class Suitcase {
    
    private int maxWeightLimit;
    private ArrayList<Thing> things=new ArrayList();
    private int suitCaseWeight=0;
    
    
    
    public Suitcase(int maxWeightLimit){
    
    this.maxWeightLimit=maxWeightLimit;
    
    
    }
    public void addThing(Thing thing){
    
    if(suitCaseWeight+thing.getWeight()<=maxWeightLimit){    
    things.add(thing);
    suitCaseWeight=suitCaseWeight+thing.getWeight();
    ;
    
    }
    
    
    
    }
    
    public void printThings(){
    
    for(Thing thing:things){
    
        System.out.println(thing);
        
    }
    
    }
    
    
    public String toString(){
    
    if(things.size()==0){
    
    return "empty (0kg)";
    
    }   else if(things.size()==1){
        
    return things.size()+" thing ("+suitCaseWeight+" kg)";
    }   else{
        
        
    return things.size()+" things ("+suitCaseWeight+" kg)";
    }
    
    }
    
    
    public int totalWeight(){
    
    return this.suitCaseWeight;
    
    }
    
    public Thing heaviestThing(){
    
        Thing haviestThing=null;
        int value=0;
        
       for(Thing thing:things){
       
        if(value<thing.getWeight()){   
        haviestThing=thing;
        value=thing.getWeight();
        }
        
       }
       
       return haviestThing;
        
    
    } 
    
    
    
}

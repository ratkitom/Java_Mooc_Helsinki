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
public class Container {
    private int maxWeightLimit;
    private ArrayList<Suitcase> suitCases=new ArrayList();
    private int containerWeight=0;
    public Container(int maxWeightLimit){
    
    this.maxWeightLimit=maxWeightLimit;
    
    
    }
    
    
    public void addSuitcase(Suitcase suitcase){
        
        if(containerWeight+suitcase.totalWeight()<=maxWeightLimit){
        suitCases.add(suitcase);
        containerWeight=containerWeight+suitcase.totalWeight();
        }
    
    }
    
    public void printThings(){
    
    for(Suitcase suitcase:this.suitCases){
    
        suitcase.printThings();
    
    }
    
    
    }
    
    
    public String toString(){
    
    return this.suitCases.size()+" suitcases ("+this.containerWeight+" kg)";
    
    }
    
    
}

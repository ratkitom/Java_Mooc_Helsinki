/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;


/**
 *
 * @author tomasz
 */
public class Item implements Thing, Comparable<Item> {

    private String name;
    private int volume;
    
    
    public Item(String name,int volume){
    
        this.name=name;
        this.volume=volume;
    
    }
    
    
    public String getName(){
    
        return name;
    
    }
    
    
    @Override
    public int getVolume() {
        
       return volume;
    }
    
    
    public String toString(){
    
        String string=name+" ("+volume+" dm^3)";
        
        return string;
    
    }

    @Override
    public int compareTo(Item t) {
        
            return this.volume-t.volume;
        
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;
import java.util.List;
import java.util.ArrayList;


/**
 *
 * @author tomasz
 */
public class Group implements Movable {


   private List<Movable> organisms;
    
    
    public Group(){
    
    organisms=new ArrayList();
    
    }
    
    public void addToGroup(Movable movable){
        
        organisms.add(movable);
        
    }

    @Override
    public void move(int dx, int dy) {
        
        
        for(Movable organism:this.organisms){
        
            organism.move(dx, dy);
        
        }
        
    }
    
    public String toString(){
    
        String tekst="";
        
        for(Movable organism:this.organisms){
        
            tekst=tekst+organism.toString()+"\n";
        
        }
    
        return tekst;
    }
    
    
    
}

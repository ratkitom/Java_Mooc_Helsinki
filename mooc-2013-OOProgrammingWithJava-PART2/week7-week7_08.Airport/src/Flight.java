/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomasz
 */
public class Flight {
    
   
    private String departure;
    private String destination;
    private Plane plane;
    
    
    public Flight(String departure,String destination,Plane plane){
        
        this.departure=departure;
        this.destination=destination;
        this.plane=plane;
        
        
        
        
        
    
    }
    
    public String toString(){
    
     return plane+" ("+departure+"-"+destination+")";
     
    
    
    }
    
   

    
}

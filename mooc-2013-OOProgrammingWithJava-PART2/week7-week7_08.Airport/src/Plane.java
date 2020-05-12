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

public class Plane {
    
   
    private String planeID;
    private int planeCapacity;
    
    
    
    public Plane(String planeID,int planeCapacity){
    
        
        this.planeID=planeID;
        this.planeCapacity=planeCapacity;
        
    
    }
    
    public String getPlaneID(){
    
    return this.planeID;
    
    }
    
    public int getPlaneCapacity(){
    
    
    return this.planeCapacity;
    
    
    }
    
    public String toString(){
    
    return planeID+" ("+planeCapacity+" ppl)";
    
    }
    

    
 
    
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author tomasz
 */

import java.util.Random;

public class Cow implements Milkable, Alive {
    
    
    
    
    private String name;
    private double udders;
    private double milkInUdders;
     public Cow(){
         
         udders=15 + new Random().nextInt(26);
         milkInUdders=0;
         
         int name=new Random().nextInt(Names.names().length);
         this.name=Names.names()[name];
     }
     
     public Cow(String name){
         
         udders=15 + new Random().nextInt(26);
         this.name=name;
         milkInUdders=0;
     }
     
     public String getName(){
     
         return name;
     }
    
     public double getCapacity(){
     
         return udders;
     }
     
     public double getAmount(){
         
         return milkInUdders;
         
     }
     
     public String toString(){
     
         return name+" "+Math.ceil(milkInUdders)+"/"+Math.ceil(udders);
     }

    @Override
    public double milk() {
        
        double milk=milkInUdders;
        milkInUdders=0;
        return milk;
    }

    @Override
    public void liveHour() {
        
        double min=0.7;
        double max=2.0;
        
        double milkIncrase=min+((max-min)*new Random().nextDouble());
        if(milkIncrase<(udders-milkInUdders)){
        milkInUdders=milkInUdders+milkIncrase;
        } else{
        
            milkInUdders=udders;
        }
        
    }
     
     
     
}

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


import java.util.List;
import java.util.ArrayList;



public class Farm implements Alive {
    
    private String owner;
    private Barn barn;
    private List<Cow> cows;
    
    
    
    public Farm(String owner,Barn barn){
    
        this.owner=owner;
        this.barn=barn;
        cows=new ArrayList<Cow>();    
    }
    
    public String getOwner(){
    
    return owner;
    
    }
    
    public void installMilkingRobot(MilkingRobot robot){
    
        
        barn.installMilkingRobot(robot);
        
    }
    
    

    @Override
    public void liveHour() {
        
        for(Cow cow:cows){
            
            cow.liveHour();
        
        }
        
        
    }
    
    public void addCow(Cow cow){
    
        cows.add(cow);
    }
    
    
    public void manageCows(){
    
       barn.takeCareOf(cows);
        
       
    }
    
    
    
    public String toString(){
        if(cows==null||cows.size()==0){
        return "Farm owner: "+owner+"\nBarn bulk tank: "+barn.getBulkTank().toString()+"\nNo cows.";
        
        } else{
        
            String cows="        ";
            for(Cow cow:this.cows){
                
                cows=cows+"\n        "+cow.toString();
            
            }
            
            return "Farm owner: "+owner+"\nBarn bulk tank: "+barn.getBulkTank().toString()+"\nAnimals:"+cows;
        
        }
        
    }
    
    
    
}

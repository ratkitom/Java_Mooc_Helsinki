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
import java.util.Collection;

public class Barn {
    
    
   private BulkTank bulkTank;
   private MilkingRobot milkingRobot;
    
    public Barn(BulkTank tank){
    
        this.bulkTank=tank;
        
    
    }
    
    public BulkTank getBulkTank(){
    
        return bulkTank;
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot){
    
        this.milkingRobot=milkingRobot;
        this.milkingRobot.setBulkTank(bulkTank);
        
    }
    
    public void takeCareOf(Cow cow) throws IllegalStateException{
        
        if(this.milkingRobot==null){
        
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        }   else{
    
    
            this.milkingRobot.milk(cow);
    
        }
    
    }
    
    
    public void takeCareOf(Collection<Cow> cows) throws IllegalStateException {

      
    
                
                for(Cow cow:cows){
                
                    takeCareOf(cow);
                }
                
    
        
        
    }
    
    
    public String toString(){
       
    
        return "Barn: "+Math.ceil(this.bulkTank.getVolume())+"/"+Math.ceil(this.bulkTank.getCapacity());
        
    }
    
    
    
}

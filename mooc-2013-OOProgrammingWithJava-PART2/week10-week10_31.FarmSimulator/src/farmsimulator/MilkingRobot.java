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
public class MilkingRobot  {
    
    
   private BulkTank bulkTank;
    
    public MilkingRobot(){
    
    }
    
    public BulkTank getBulkTank(){
        
        return bulkTank;
    }
    
    public void setBulkTank(BulkTank tank){
        bulkTank=tank;
    }
    
    public void milk(Milkable milkable) throws IllegalStateException {
        
        if(bulkTank==null){
        
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        } else{
        
            
            bulkTank.addToTank(milkable.milk());
        
        }
    }

  
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

/**
 *
 * @author tomasz
 */
public class ProductContainerRecorder extends ProductContainer {
    
    private ContainerHistory containerHistory;
    
   public ProductContainerRecorder(String productName, double capacity, double initialVolume){
   
       super(productName,capacity);
       super.addToTheContainer(initialVolume);
       this.containerHistory=new ContainerHistory();
       this.containerHistory.add(initialVolume);
   
   }
   
   
   
   public void addToTheContainer(double amount){
   
   
   super.addToTheContainer(amount);
   this.containerHistory.add(super.getVolume());
   
   
   }
   
   public double takeFromTheContainer(double amount){
   
       
       
       double taken= super.takeFromTheContainer(amount);
       this.containerHistory.add(super.getVolume());
       return taken;
       
       
       
   
   }
   
    public String history(){
        
        
        return this.containerHistory.toString();
    }
    
    public void printAnalysis(){
    
      
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + this.containerHistory);
        System.out.println("Greatest product amount: " + this.containerHistory.maxValue());
        System.out.println("Smallest product amount: " + this.containerHistory.minValue());
        System.out.println("Average: " + this.containerHistory.average());
        System.out.println("Greatest change: " + this.containerHistory.greatestFluctuation());
        System.out.println("Variance: " + this.containerHistory.variance());
    }
   
   
    
    
}

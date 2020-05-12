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

import java.util.List;
import java.util.ArrayList;


public class ContainerHistory {
    
    
    private List<Double> containerHistory;
    
    public ContainerHistory(){
    
    this.containerHistory=new ArrayList();
    
    }
    
    public void add(double situation){
    
        this.containerHistory.add(situation);
    
    }
    
    public void reset(){
    
        this.containerHistory.clear();
        
    }
    
    public String toString(){
    
        return this.containerHistory.toString();
    }
    
    
    public double maxValue(){
        
        if(this.containerHistory.isEmpty()) return 0;
        
        double max=this.containerHistory.get(0);
        
        for(double value:this.containerHistory){
        
            if(value>max){
            
                max=value;
            }
        
        }
        
        return max;
    
    }
    
    
    public double minValue(){
         
        if(this.containerHistory.isEmpty()) return 0;
       
        double min=this.containerHistory.get(0);
        
       for(double value:this.containerHistory){
        
            if(value<min){
            
                min=value;
            }
        
        }
        
        return min;
    
    }
    
    public double average(){
  
        if(this.containerHistory.isEmpty()) return 0;
        
        double average=0;
        double sum=0;
        
        for(double value:this.containerHistory){
        
            sum=sum+value;
        
        }
        
        average=sum/this.containerHistory.size();
        
        return average;
        
    }
    
    public double greatestFluctuation(){
    
         if (this.containerHistory.size() > 1) {
            double greatestFluctuation = Math.abs(this.containerHistory.get(0) - this.containerHistory.get(1));

            for (int i = 0; i < this.containerHistory.size() - 1; i++) {
                double comparedFluctuation = Math.abs(this.containerHistory.get(i) - this.containerHistory.get(i + 1));
                if (comparedFluctuation > greatestFluctuation) {
                    greatestFluctuation = comparedFluctuation;
                }
            }

            return greatestFluctuation;
        }

        return 0;
    
    }
    
    public double variance(){
        
    if (this.containerHistory.size() > 1) {
            double variance = 0;
            
            for (double value : this.containerHistory) {
                variance += Math.pow(value - this.average(), 2);
            }
            
            return variance / (this.containerHistory.size() - 1) ;
        }
        
        return 0;
    }
    
}

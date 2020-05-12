/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author tomasz
 */
public class AverageSensor implements Sensor {
    
    
   private ArrayList<Sensor> sensors;
   private  List<Integer> measures;
   
    
    public AverageSensor(){
    
        this.sensors=new ArrayList<Sensor>();
        this.measures=new ArrayList();
        
    
    }
    

    @Override
    public boolean isOn() {
        
        boolean onOff=true;
        
        for(Sensor sensor:sensors){
        
        
                if(!sensor.isOn()) return false;
        
        }
        
        
        return true;
        
        
        
    }

    @Override
    public void on() {
        
        for(Sensor sensor:sensors){
        
        
            sensor.on();
        
        }
        
        
        
        
        
    }

    @Override
    public void off() {
           for(Sensor sensor:sensors){
        
        
            sensor.off();
        
        }
           
           
        
    }

    @Override
    public int measure() {
        
        
        
        if(!this.isOn()||sensors.size()==0) throw new IllegalStateException();
        
        int average=0;
        for(Sensor sensor:sensors){
        
            
            average=average+sensor.measure();
            
        
        
        }
        
        average=average/sensors.size();
        
        measures.add(average);
        
        return average;
        
    }
    
    public void addSensor(Sensor additional){
        
        
        sensors.add(additional);
    
        
    
    }
    
    public List<Integer> readings(){
        
        
     
    
        return measures;
        
    
    }
    
    
    
    
    
    
}

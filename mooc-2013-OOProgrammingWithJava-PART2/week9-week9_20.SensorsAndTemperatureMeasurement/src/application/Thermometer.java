/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;
import java.util.Random;

/**
 *
 * @author tomasz
 */
public class Thermometer implements Sensor {
    
    
    
    private Random rand;
    private boolean onOff;
    
    public Thermometer(){
    
        this.rand=new Random();
        this.onOff=false;
    }

    @Override
    public boolean isOn() {
        
        return onOff;
    }

    @Override
    public void on() {
        
        onOff=true;
        
    }

    @Override
    public void off() {
        
        onOff=false;
    }

    @Override
    public int measure() {
        
        if(!isOn()) throw new IllegalStateException();
        
        int temperature=rand.nextInt(61)-30;
        
        return temperature;
        
    }
    
    
    
    
    
}

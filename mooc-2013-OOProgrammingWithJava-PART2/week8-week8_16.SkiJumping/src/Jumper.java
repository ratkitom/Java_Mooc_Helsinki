/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomasz
 */

import java.util.HashMap;
import java.util.Random;

public class Jumper implements Comparable<Jumper> {
    
    private String name;
    private JumperStats stats;
    private Random rand;
    
    public Jumper(String name){
    
    
    this.name=name;
    this.stats=new JumperStats();
    this.rand=new Random();
    
    
    }
    
    public void jump(){
        
        int jumpLength=rand.nextInt(61)+60;
        
        stats.updateStats(jumpLength);
    
    
    }
    
    public String getName(){
    
    
    return name;
    }
    public JumperStats getStats(){
    
    return this.stats;
    
    }

    @Override
    public int compareTo(Jumper t) {
        
        int result=this.stats.getPoints()-t.stats.getPoints();
        
        return result;
        
        
    }
    
    
    
  
  
    
  
  
    
    
    
    
    
}

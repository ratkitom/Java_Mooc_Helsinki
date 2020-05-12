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



public class JumperStats {
    
    
    private int points;
    private int jumpLength;
    private Judges jumpRate;
    private ArrayList<Integer> allJumps;
    
    
    public JumperStats(){
    
    this.jumpRate=new Judges();
    this.allJumps=new ArrayList<Integer>();
    
    }
    
    public void updateStats(int jumpLength){
    
        this.jumpLength=jumpLength;
        jumpRate.jumpJudge();
        points=points+jumpLength+jumpRate.getPoints();
        allJumps.add(jumpLength);
        
        
        
    
    }
    
    public int getPoints(){
    
        return points;
    
    }
    
    public Judges getJumpRates(){
    
    
        return jumpRate;
        
    }
    
    public int getJumpLength(){
    
        return jumpLength;
    
    }
    
    public ArrayList<Integer> getAllJumps(){
    
    
    return allJumps;
    }
    
    
    
    
    
    
}

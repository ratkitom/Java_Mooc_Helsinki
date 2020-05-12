/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomasz
 */

import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class Judges {
    
    
    private Random rand;
    private ArrayList<Integer> rates;
    private int pointsForJump;
    
    
    public Judges(){
    
    rand=new Random();
    
    }
    
    public void jumpJudge(){
    
    rates=new ArrayList<Integer>();
    int rate=0;
    int sum=0;
    for(int i=0;i<=4;i++){
        
        rate=rand.nextInt(11)+10;
        
        sum=sum+rate;
        rates.add(rate);
        
        
    
    }
    
    int min=Collections.min(rates);
    int max=Collections.max(rates);
    
    pointsForJump=sum-(min+max);
    
        
    
    }
    
    public ArrayList<Integer> getRates(){
    
    return rates;
    
    }
    
    public int getPoints(){
    
    return pointsForJump;
    
    }
    
    
    
    
}

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
public class NightSky {
    
    private double denisty;
    private int width;
    private int height;
    private int starsInLastPrint;
    
    
    public NightSky(double density){
    
        this.denisty=density;
        this.width=20;
        this.height=10;
       
    
    
    }
    
   public NightSky(int width, int height){
        this.width=width;
        this.height=height;
        this.denisty=0.1;
    
    }
   
   public NightSky(double density, int width, int height){
   
        this.width=width;
        this.height=height;
        this.denisty=density;
   
   }
   
   public void printLine(){
   
   double var=0;
   Random random=new Random();
   
   for(int i=0;i<width;i++){
   
       var=random.nextDouble();
       if(var<=this.denisty){
       
           System.out.print("*");
           this.starsInLastPrint++;
       }
       else{
       
           System.out.print(" ");
       
       }
       
       
       }
 
   }
   
   
   
    public void print(){
        
        this.starsInLastPrint=0;
    
    for(int i=0;i<this.height;i++){
    
    this.printLine();
        System.out.println("");
    
    }
    
    }
    
    
  public int starsInLastPrint(){
  
  return this.starsInLastPrint;
  
  }
   
   }
    
    

